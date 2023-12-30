package com.example.ca1_2;

public class Container {
    private String containerNum;
    private int size;

    private String shipName;



    TheList<Container> containers = new TheList<>();


    public Container(String containerNum, int size, String shipName) {
        this.containerNum = containerNum;
        this.size = size;
        this.shipName=shipName;
    }


    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getContainerNum() {
        return containerNum;
    }

    public void setContainerNum(String containerNum) {
        this.containerNum = containerNum;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Container{" +
                "containerNum='" + containerNum + '\'' +
                ", size=" + size +
                ", shipName='" + shipName + '\'' +
                '}';
    }
}
