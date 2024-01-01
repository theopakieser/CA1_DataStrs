package com.example.ca1_2;

public class Ship {
    private String name;
    private String shipID;
    private String flagState;

    private String photograph;

    private Port dockedAt;



    TheList<Ship> ships = new TheList<>();

    public Ship(String name, String shipID, String flagState, String photograph, Port dockedAt) {
        this.name = name;
        this.shipID = shipID;
        this.flagState = flagState;
        this.photograph = photograph;
        this.dockedAt=dockedAt;
    }

    public Port getDockedAt() {
      return dockedAt;
    }

    public void setDockedAt(Port dockedAt) {
        this.dockedAt = dockedAt;
    }

    public String getPhotograph() {
        return photograph;
    }

    public void setPhotograph(String photograph) {
        this.photograph = photograph;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShipID() {
        return shipID;
    }

    public void setShipID(String shipID) {
        this.shipID = shipID;
    }

    public String getFlagState() {
        return flagState;
    }

    public void setFlagState(String flagState) {
        this.flagState = flagState;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", shipID='" + shipID + '\'' +
                ", flagState='" + flagState + '\'' +
                ", photograph='" + photograph + '\'' +
                ", dockedAt=" + dockedAt +
                '}';
    }
}
