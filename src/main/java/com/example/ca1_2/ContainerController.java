package com.example.ca1_2;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ContainerController {

    public TextField num, size, shipName, viewShipName;

    public TextArea viewShip, viewContainers;

    @FXML
    protected void onAddContainerClicked() throws IOException {
        TheList<Ship>.TheNode<Ship> foundShip = HelloApplication.ships.head;
        while (foundShip != null) {
            if (foundShip.getContents().getName().equals(shipName.getText())) {
                viewShip.setText(foundShip.toString());
                String containerSize = size.getText();
                int size = Integer.parseInt(containerSize);
                HelloApplication.containers.addElement(new Container(num.getText(), size,foundShip.getContents().getName()));
                System.out.println(HelloApplication.ships.head);
                return; // Exit the method after adding
            } else {
                foundShip = foundShip.next;
            }
        }
    }

    @FXML
    protected void onPickShipClicked() {
        TheList<Ship>.TheNode<Ship> pickedShip = HelloApplication.ships.head;
        while (pickedShip!=null) {
            if (pickedShip.getContents() != null && pickedShip.getContents().getName().equals(viewShipName.getText())) {
                viewShip.setText(pickedShip.toString());
                System.out.println("Ship found: " + pickedShip.getContents());
                return;
            } else {
                pickedShip=pickedShip.next;
            }
        }

        System.out.println("Not found :(");
    }

    @FXML
    protected void onViewContainersClicked() throws IOException {
        TheList.TheNode temp = HelloApplication.containers.head;
        StringBuilder containers = new StringBuilder(); //creates a stringbuilder to loop the text - https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/
        while (temp != null) {
             containers.append(temp.toString()).append("\n"); // append makes the Stringbuilder exist via toString then uses the \n to new line after each
            temp = temp.next;
        }
        viewContainers.setText(containers.toString());
    }





}

