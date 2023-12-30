package com.example.ca1_2;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {

    @FXML
    protected void onExitClicked() {
        Platform.exit();
    }

    @FXML
    protected void onPortClicked() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("port-menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        Stage stage = new Stage();
        stage.setTitle("The Port Menu");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onShipClicked() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ship-menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        Stage stage = new Stage();
        stage.setTitle("The Ship Menu");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onContainerClicked() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("container-menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        Stage stage = new Stage();
        stage.setTitle("The Container Menu");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onPalletClicked() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("pallet-menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        Stage stage = new Stage();
        stage.setTitle("The Pallet Menu");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onResetClicked() throws IOException {
        HelloApplication.ports.clear();
        HelloApplication.ships.clear();
        HelloApplication.containers.clear();
        HelloApplication.pallets.clear();
        System.out.println("Successfully Reset the System :)");
    }

    public TextArea viewAll;

    //TODO fix onViewEverythingClicked
    @FXML
    protected void onViewEverythingClicked() throws IOException {
       TheList.TheNode ptemp = HelloApplication.ports.head;
        while(ptemp!=null){
            System.out.println("*****\nPorts: " + ptemp + "\n*****");
            TheList.TheNode stemp = HelloApplication.ships.head;
            while(stemp!=null){
                System.out.println("**********\nShips: "+stemp+"\n**********");
                TheList.TheNode ctemp = HelloApplication.containers.head;
                while(ctemp!=null){
                    System.out.println("***************\nContainers: "+ctemp+"\n***************");
                    TheList.TheNode pltemp=HelloApplication.pallets.head;
                    while(pltemp!=null){
                        System.out.println("********************\nPallets: " +pltemp);
                        pltemp=pltemp.next;
                    }
                    ctemp=ctemp.next;
                }
                stemp=stemp.next;
            }
            ptemp=ptemp.next;
        }
    }

    @FXML
    protected void onSettingsClicked() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("settings-menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        Stage stage = new Stage();
        stage.setTitle("The Settings Menu");
        stage.setScene(scene);
        stage.show();
    }


}


