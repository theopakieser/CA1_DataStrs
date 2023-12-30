package com.example.ca1_2;

public class Pallet {
    private String description;
    private int quantityOfGoods;
    private String unitValue;
    private int totalWeight;
    private int totalSize;

    private String containerNum;

    TheList<Pallet> pallets = new TheList<>();

    public Pallet(String description, int quantityOfGoods, String unitValue, int totalWeight, int totalSize, String containerNum) {
        this.description = description;
        this.quantityOfGoods = quantityOfGoods;
        this.unitValue = unitValue;
        this.totalWeight = totalWeight;
        this.totalSize = totalSize;
        this.containerNum=containerNum;
    }

    public String getContainerNum() {
        return containerNum;
    }

    public void setContainerNum(String containerNum) {
        this.containerNum = containerNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantityOfGoods() {
        return quantityOfGoods;
    }

    public void setQuantityOfGoods(int quantityOfGoods) {
        this.quantityOfGoods = quantityOfGoods;
    }

    public String getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(String unitValue) {
        this.unitValue = unitValue;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    @Override
    public String toString() {
        return "Pallet{" +
                "description='" + description + '\'' +
                ", quantityOfGoods=" + quantityOfGoods +
                ", unitValue=" + unitValue +
                ", totalWeight=" + totalWeight +
                ", totalSize=" + totalSize +
                ", containerNum=" + containerNum +
                '}';
    }
}
