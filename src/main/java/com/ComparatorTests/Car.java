package com.ComparatorTests;

public class Car implements Comparable<Car>{

    private int manufactureYear;
    private String model;
    private int maxSpeed;

    public Car(int manufactureYear, String model, int maxSpeed) {
        this.manufactureYear = manufactureYear;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int compareTo(Car car) {
        return this.getManufactureYear() - car.getManufactureYear();
    }

    public int getManufactureYear() {
        return this.manufactureYear;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
