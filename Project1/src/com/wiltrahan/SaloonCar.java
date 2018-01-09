package com.wiltrahan;

public class SaloonCar extends Car {

    public int numberOfSeats;

    public SaloonCar(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public SaloonCar(int numberOfSeats, String manufacturer) {
        super(manufacturer);
        this.numberOfSeats = numberOfSeats;
    }

    public SaloonCar(int numberOfSeats, String manufacturer, String color) {
        super(color, manufacturer);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}
