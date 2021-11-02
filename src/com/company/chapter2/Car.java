package com.company.chapter2;

public class Car {
    private double distance;
    private final double fuelCapacity;
    private double fuelLevel;
    private double fuelEfficiency;

    public Car(double distance, double fuelCapacity, double fuelLevel, double fuelEfficiency) {
        this.distance = distance;
        this.fuelCapacity = fuelCapacity;
        this.fuelLevel = fuelLevel;
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getDistance() {
        return distance;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void refuel(int gallons) {
        fuelLevel += gallons;
        if (Double.compare(fuelLevel, fuelCapacity) > 0)
            fuelLevel = fuelCapacity;
    }

    public void move(int numOfMiles) {
        double fuelDemand = numOfMiles / fuelEfficiency;
        if(Double.compare(fuelLevel - fuelDemand, 0.0) < 0) {
            System.out.println("Not enough fuel!");
            return;
        }
        distance += numOfMiles;
        fuelLevel -= fuelDemand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "distance=" + distance +
                ", fuelCapacity=" + fuelCapacity +
                ", fuelLevel=" + fuelLevel +
                ", fuelEfficiency=" + fuelEfficiency +
                '}';
    }
}
