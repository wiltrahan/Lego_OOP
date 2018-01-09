package com.wiltrahan;

public class Car {

    public String color;
    public String manufacturer;

    public Car() {
    }

    public Car(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Car(String color, String manufacturer) {
        this.color = color;
        this.manufacturer = manufacturer;
    }
    

    public String getColor() {
        return color;
    }


    public String getManufacturer() {
        return manufacturer;
    }


}
