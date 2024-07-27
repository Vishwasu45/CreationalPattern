package com.pattern.creational.factorypattern.factory;

import com.pattern.creational.factorypattern.instance.Car;
import com.pattern.creational.factorypattern.instance.MotorVehicle;

public class CarFactory extends MotorVehicleFactory {

    @Override
    protected MotorVehicle createMotorVehicle() {
        return new Car();
    }
}
