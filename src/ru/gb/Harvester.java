package ru.gb;

import java.awt.Color;

/**
 * Класс уборочная машина
 */
public class Harvester extends Car implements Fueling, Wiping {
    private Refueling refueling;

    public Harvester(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(6);
    }

    public void setRefuelingStation(RefuelingStation refuelingStation) {
        this.refueling = refuelingStation;
    }

    @Override
    public void fuel() {
        if (refueling != null) {
            refueling.fuel(fuelType);
        }
    }

    @Override
    public void movement() {

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

    /** Метод отвечающий за функцию автомобиля подмитать улицу */
    public void sweeping() {
        System.out.println("Автомобиль метет улицу.");
    }

    @Override
    public void wipMirrors() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadLights() {

    }
}
