package com.example.ca1_2;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class PalletController {

    public TextField quantity, value, size, description, weight, containerNum, viewContainerNum, palletToDel;

    public TextArea viewContainer, viewPallets, viewPalletsDes, viewPalletsValue;

    @FXML
    protected void onAddPalletClicked() throws IOException {
        TheList<Container>.TheNode<Container> foundContainer= HelloApplication.containers.head;
        while (foundContainer != null) {
            if (foundContainer.getContents().getContainerNum().equals(containerNum.getText())) {
                viewContainer.setText(foundContainer.toString());
                String quantityOfGoods = quantity.getText();
                int quantity = Integer.parseInt(quantityOfGoods);
                String totalWeight = weight.getText();
                int weight = Integer.parseInt(totalWeight);
                String totalSize=size.getText();
                int size = Integer.parseInt(totalSize);
                HelloApplication.pallets.addElement(new Pallet(description.getText(), quantity, value.getText(), weight, size, foundContainer.getContents().getContainerNum()));
                System.out.println(HelloApplication.pallets.head);
                return; // Exit the method after adding
            } else {
                foundContainer = foundContainer.next;
            }
        }
    }


    @FXML
    protected void onPickContainerClicked() {
        TheList<Container>.TheNode<Container> pickedContainer = HelloApplication.containers.head;
        while (pickedContainer!=null) {
            if (pickedContainer.getContents() != null && pickedContainer.getContents().getContainerNum().equals(viewContainerNum.getText())) {
                viewContainer.setText(pickedContainer.toString());
                System.out.println("Container found: " + pickedContainer.getContents());
                return;
            } else {
                pickedContainer=pickedContainer.next;
            }
        }

        System.out.println("Not found :(");
    }

    @FXML
    protected void onViewPalletsClicked() throws IOException {
        TheList.TheNode temp = HelloApplication.pallets.head;
        StringBuilder pallets = new StringBuilder(); //creates a stringbuilder to loop the text - https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/
        while (temp != null) {
            pallets.append(temp.toString()).append("\n"); // append makes the Stringbuilder exist via toString then uses the \n to new line after each
            temp = temp.next;
        }
        viewPallets.setText(pallets.toString());
    }


    @FXML
    protected void onDeletePalletClicked() {
        System.out.println("Selected Pallet to delete: " + palletToDel.getText());
        TheList<Pallet>.TheNode<Pallet> palletToDelete= HelloApplication.pallets.head;
        TheList<Pallet>.TheNode<Pallet> prevPallet = null;
        while (palletToDelete != null) {
            if (palletToDelete.getContents().getDescription().equals(palletToDel.getText())) {
                if (prevPallet == null) {
                    HelloApplication.pallets.head = palletToDelete.next;
                } else {
                    prevPallet.next = palletToDelete.next;
                }
                System.out.println("Deleted :)");
                return;
            } else {
                prevPallet = palletToDelete;
                palletToDelete = palletToDelete.next;
            }
        }

        System.out.println("Not deleted :(");
    }

    @FXML
    protected void onViewPalletsDesClicked() throws IOException {
        TheList<Pallet>.TheNode<Pallet> temp = HelloApplication.pallets.head;
        StringBuilder pallets = new StringBuilder(); //creates a stringbuilder to loop the text - https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/
        while (temp != null) {
            pallets.append(temp.getContents().getDescription()).append("\n"); // append makes the Stringbuilder exist via toString then uses the \n to new line after each
            temp = temp.next;
        }
        viewPalletsDes.setText(pallets.toString());
    }

    @FXML
    protected void onViewPalletsValClicked() throws IOException {
        TheList<Pallet>.TheNode<Pallet> temp = HelloApplication.pallets.head;
        StringBuilder pallets = new StringBuilder(); //creates a stringbuilder to loop the text - https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/
        while (temp != null) {
            pallets.append(temp.getContents().getUnitValue()).append("\n"); // append makes the Stringbuilder exist via toString then uses the \n to new line after each
            temp = temp.next;
        }
        viewPalletsValue.setText(temp.toString());
    }

}
