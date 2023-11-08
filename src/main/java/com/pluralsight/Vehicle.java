package com.pluralsight;

public class Vehicle extends Asset {
    private String makeModel;
    private int year,odometer;

    public Vehicle(String description, String dateAcquired, double originalCost,String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    @Override
    public double getValue() {
        String[] yearSplit = dateAcquired.split("/");
        double value = 0;
        int currentYear = 2023;
        int yearInt = Integer.parseInt(yearSplit[2]);
        String makeModelLowerCase = makeModel.toLowerCase();
        if (year <= 3) {
            value = (originalCost) - (.03 * originalCost) * (currentYear - yearInt);
        } else if (year >= 4 && year <= 6) {
            value = (originalCost) - (.06 * originalCost) * (currentYear - yearInt);
        } else if (year >= 7 && year <= 10) {
            value = (originalCost) - (.08 * originalCost) * (currentYear - yearInt);
        } else if (year > 10) {
            value = (originalCost) - 1000;
        }

        if (odometer > 100000) {
            if (!makeModelLowerCase.contains("honda") || !makeModelLowerCase.contains("toyota")) {
                value = originalCost - (.25 * originalCost);
            }
        }
        return value;
    }
}
