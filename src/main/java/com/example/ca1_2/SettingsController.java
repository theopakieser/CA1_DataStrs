package com.example.ca1_2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.IOException;

public class SettingsController {
    @FXML
    protected void onResetClicked() throws IOException {
        HelloApplication.ports.clear();
        HelloApplication.ships.clear();
        HelloApplication.containers.clear();
        HelloApplication.pallets.clear();
        System.out.println("Successfully Reset the System :)");
    }

//    @FXML
//    protected void onSavePortClicked() throws IOException {
//        XStream xstream = new XStream(new DomDriver());
//        TheList<Port> portList= HelloApplication.ports;
//        ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("ports.xml"));
//        out.writeObject(portList);
//        out.close();
//    }
//
//    @FXML
//    protected void onSaveShipClicked() throws IOException {
//        XStream xstream = new XStream(new DomDriver());
//        TheList<Ship> shipList= HelloApplication.ships;
//        ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("ships.xml"));
//        out.writeObject(shipList);
//        out.close();
//    }
//
//    @FXML
//    protected void onSaveContainerClicked() throws IOException {
//        XStream xstream = new XStream(new DomDriver());
//        TheList<Container> containerList= HelloApplication.containers;
//        ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("containers.xml"));
//        out.writeObject(containerList);
//        out.close();
//    }
//
//    @FXML
//    protected void onSavePalletClicked() throws IOException {
//        XStream xstream = new XStream(new DomDriver());
//        TheList<Pallet> palletList= HelloApplication.pallets;
//        ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("pallets.xml"));
//        out.writeObject(palletList);
//        out.close();
//    }
//
//    protected void onLoadPortClicked() throws IOException, ClassNotFoundException {
//        Class<?>[] classes = new Class[]{Port.class, TheList.class};
//        XStream xstream = new XStream(new DomDriver());
//        xstream.allowTypes(classes);
//        ObjectInputStream is = xstream.createObjectInputStream(new FileReader("ports.xml"));
//        TheList<Port> loadedList = (TheList<Port>) is.readObject();
//        loadedList.listElements();
//
//        is.close();
//    }
//
//
}
