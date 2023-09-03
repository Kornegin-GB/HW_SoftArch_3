package ru.gb;

import java.awt.Color;

/**
 * Класс описывает летающий автомобиль
 */
public class FlyCar extends Car {

    public FlyCar(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(4);
    }

    public void fly() {
        System.out.println("Автомобиль летит!");
    }

    @Override
    public void movement() {
        fly();
    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadLights() {
        return false;
    }

    @Override
    public boolean swithWipers() {
        return false;
    }

}