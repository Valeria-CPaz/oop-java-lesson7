package com.val;

public class Car extends Vehicle{

    public Car() {

        MessageCentre.DebugMessage("Car is created");
    }

    public Car(String manufacturer, String modelName) {

        MessageCentre.DebugMessage("Car is created with manu and name ");

        setManufacturer(manufacturer);
        setModelName(modelName);

    }

    @Override
    public String toString() {
        return String.format("ToString() => c2 manufacturer: %s, model: %s", getManufacturer(), getModelName());
    }
}
