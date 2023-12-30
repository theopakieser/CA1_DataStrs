package com.example.ca1_2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class PortController {

    public TextField portName, portCode, portCountry;

    public TextArea portsView;



    @FXML
    protected void onViewPortsClicked() throws IOException {
        TheList.TheNode temp = HelloApplication.ports.head;
        StringBuilder Ports = new StringBuilder(); //creates a stringbuilder to loop the text - https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/
        while (temp != null) {
            Ports.append(temp.toString()).append("\n"); // append makes the Stringbuilder exist via toString then uses the \n to new line after each
            temp = temp.next;
        }
        portsView.setText(Ports.toString());
    }

    @FXML
    protected void onAddPortClicked() throws IOException {
        String code = portCode.getText();
        int portCode = Integer.parseInt(code);
        HelloApplication.ports.addElement(new Port(portName.getText(), portCode, portCountry.getText()));
        System.out.println("Port Added Sucessfully :)");
    }

}
