package com.example.ca1_2;

public class Port {
    private String name;
    private int intCode;
    private String country;

    TheList<Port> ports = new TheList<>();


    public Port(String name, int intCode, String country) {
        this.name = name;
        this.intCode = intCode;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIntCode() {
        return intCode;
    }

    public void setIntCode(int intCode) {
        this.intCode = intCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }





    @Override
    public String toString() {
        return "Port{" +
                "name='" + name + '\'' +
                ", intCode=" + intCode +
                ", country='" + country + '\'' +
                '}';
    }
}
