package com.example.ca1_2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main-menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        stage.setTitle("Ship Management System");
        stage.setScene(scene);
        stage.show();
        ports.addElement(new Port("At Sea", 0, "N/A"));
    }

    static TheList<Port> ports = new TheList<>();
    static TheList<Ship> ships = new TheList<>();
    static TheList<Container> containers = new TheList<>();
    static TheList<Pallet> pallets = new TheList<>();

    public static void main(String[] args) {
        launch();
    }




}