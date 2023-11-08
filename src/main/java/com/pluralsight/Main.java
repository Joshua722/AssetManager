package com.pluralsight;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("0.00");
        assets.add(new House("my house","10/23/1994",242304.32,"1112 Orangeman Ln",2,2003,2));
        assets.add(new Vehicle("Truck","10/23/2017",32000.32,"toyota Tacoma",1956,200304));
        assets.add(new House("my workhouse","04/22/2021",43924.23,"1114 Orangewoman Ln",4,3333,3));
        assets.add(new Vehicle("van","04/22/2020",12300.32,"honda van",2020,200000));
        for(int i = 0; i < 4; i++){
            if(assets.get(i) instanceof House){
                House house1 = (House) assets.get(i);
                String message = "House at " + house1.getAddress() + " " + df.format(house1.getValue());
                System.out.println(message);
            } else if (assets.get(i) instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) assets.get(i);
                String message = "Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel() + " " + df.format(vehicle.getValue()) + " This is original Price " + vehicle.getOriginalCost();
                System.out.println(message);
            }
        }


    }
}
