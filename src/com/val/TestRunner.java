package com.val;

public class TestRunner {

    public void Run() {

//        Vehicle v1 = new Vehicle(); // abstract, cannot be instantiated

        Car c1 = new Car();

        Car c2 = new Car("Nissan", "Navara");

        MessageCentre.DebugMessage(String.format("C2 manufacturer: %s, model: %s", c2.getManufacturer(), c2.getModelName() ));

        Bicycle bike1 = new Bicycle();

        RowingBoat rb1 = new RowingBoat();

        Plane plane1 = new Plane();
    }
}
