package com.example.ca1_2;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ShipController {

    public TextField shipName, id, state, photograph, portName, viewPortName, dockingViewPortName, dockingViewShipName, editDockingShipName, editDockingPortName;
    public TextArea viewPort, viewShips, dockingViewPort, dockingViewShip, editDockingViewShip;


    @FXML
    protected void onAddShipClicked() throws IOException {
        TheList<Port>.TheNode<Port> foundPort = HelloApplication.ports.head;
        while (foundPort != null) {
            if (foundPort.getContents().getName().equals(portName.getText())) {
                viewPort.setText(foundPort.toString());
                HelloApplication.ships.addElement(new Ship(shipName.getText(), id.getText(), state.getText(), photograph.getText(), foundPort.getContents()));
                System.out.println(HelloApplication.ships.head);
                return; // Exit the method after adding
            } else {
                foundPort = foundPort.next;
            }
        }
    }

    @FXML
    protected void onPickPortClicked() {
        TheList<Port>.TheNode<Port> pickedPort = HelloApplication.ports.head;
        while (pickedPort!=null) {
            if (pickedPort.getContents() != null && pickedPort.getContents().getName().equals(viewPortName.getText())) {
                viewPort.setText(pickedPort.toString());
                System.out.println("Port found: " + pickedPort.getContents());
                return;
            } else {
                pickedPort=pickedPort.next;
            }
        }

        System.out.println("Not found :(");
    }

    @FXML
    protected void onViewShipsClicked() throws IOException {
        TheList.TheNode temp = HelloApplication.ships.head;
        StringBuilder Ships = new StringBuilder(); //creates a stringbuilder to loop the text - yoinked from ca2
        while (temp != null) {
            Ships.append(temp.toString()).append("\n"); // append makes the Stringbuilder exist via toString then uses the \n to new line after each
            temp = temp.next;
        }
        viewShips.setText(Ships.toString());
    }

    @FXML
    protected void onPickShipClicked() {
        TheList<Ship>.TheNode<Ship> pickedShip = HelloApplication.ships.head;
        while (pickedShip!=null) {
            if (pickedShip.getContents() != null && pickedShip.getContents().getName().equals(dockingViewShipName.getText())) {
                dockingViewShip.setText(pickedShip.toString());
                System.out.println("Ship found: " + pickedShip.getContents());
                return;
            } else {
                pickedShip=pickedShip.next;
            }
        }

        System.out.println("Not found :(");
    }

    @FXML
    protected void onDockingPickPortClicked() {
        TheList<Port>.TheNode<Port> pickedPort = HelloApplication.ports.head;
        while (pickedPort!=null) {
            if (pickedPort.getContents() != null && pickedPort.getContents().getName().equals(dockingViewPortName.getText())) {
                dockingViewPort.setText(pickedPort.toString());
                System.out.println("Port found: " + pickedPort.getContents());
                return;
            } else {
                pickedPort=pickedPort.next;
            }
        }

        System.out.println("Not found :(");
    }

    @FXML
    protected void onEditDockingClicked() {
        TheList<Port>.TheNode<Port> portName = HelloApplication.ports.head;
        while (portName != null) {
            if (portName.getContents().getName().equals(dockingViewPortName.getText())) {
                dockingViewPort.setText(portName.toString());
                TheList<Ship>.TheNode<Ship> tempShip = HelloApplication.ships.head;
                while (tempShip != null) {
                    if (tempShip.getContents().getName().equals(editDockingShipName.getText())) {
                        Ship editedShip = tempShip.getContents();
                        Port tempPort = portName.getContents();
                        editedShip.setDockedAt(tempPort);
                        System.out.println(editedShip);
                        return;
                    } else {
                        tempShip = tempShip.next;
                    }
                }
            }
        }
    }

}
