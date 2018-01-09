package com.wiltrahan;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Red","Toyota");
        System.out.println("Car1 is " + car1.getColor() + " and made by " + car1.getManufacturer());

        SaloonCar sCar1 = new SaloonCar(2);
        SaloonCar sCar2 = new SaloonCar(3,"Nissan");
        SaloonCar sCar3 = new SaloonCar(4, "Ford", "purple");

        System.out.println("SaloonCar1 has " + sCar1.getNumberOfSeats() + " seats");
        System.out.println("SaloonCar2 has " + sCar2.getNumberOfSeats() + " seats and is made by " + sCar2.getManufacturer());
        System.out.println("SaloonCar3 has " + sCar3.getNumberOfSeats() + " seats is made by " + sCar3.getManufacturer() +
                            " and is " + sCar3.getColor());

    }
}
