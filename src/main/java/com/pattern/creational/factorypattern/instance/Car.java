package com.pattern.creational.factorypattern.instance;

public class Car implements MotorVehicle {

    @Override
    public void build() {
        System.out.println("Build Car");
    }
}
