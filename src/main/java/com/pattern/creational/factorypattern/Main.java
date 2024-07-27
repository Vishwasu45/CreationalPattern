package com.pattern.creational.factorypattern;

import com.pattern.creational.factorypattern.factory.CarFactory;
import com.pattern.creational.factorypattern.factory.MotorVehicleFactory;
import com.pattern.creational.factorypattern.factory.MotorcycleFactory;
import com.pattern.creational.factorypattern.instance.MotorVehicle;

public class Main {

    public static void main(String[] args) {

        // MotoCycle
        MotorVehicleFactory motorcycleFactory = new MotorcycleFactory();
        MotorVehicle motorCycle = motorcycleFactory.create();
        motorCycle.build();

        //Car
        MotorVehicleFactory carFactory = new CarFactory();
        MotorVehicle car = carFactory.create();
        car.build();
    }
}
