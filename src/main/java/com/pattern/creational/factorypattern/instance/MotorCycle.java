package com.pattern.creational.factorypattern.instance;

public class MotorCycle implements MotorVehicle{

    @Override
    public void build() {
        System.out.println("Build Motorcycle");
    }
}
