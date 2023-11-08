package com.pluralsight;

public class House extends Asset {
    private String address;
    private int condition,squareFoot,lotSize;


    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
    public double getValue(){
        switch(condition){
            case 1:
                value = (180 * squareFoot) + .25 * lotSize;
                break;
            case 2:
                value = (130 * squareFoot) + .25 * lotSize;
                break;
            case 3:
                value = (90 * squareFoot) + .25 * lotSize;
                break;
            case 4:
                value = (80 * squareFoot) + .25 * lotSize;
        }
        return value;
    }
}
