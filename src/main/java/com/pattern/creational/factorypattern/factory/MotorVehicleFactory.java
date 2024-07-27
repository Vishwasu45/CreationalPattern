package com.pattern.creational.factorypattern.factory;

import com.pattern.creational.factorypattern.instance.MotorVehicle;

public abstract class MotorVehicleFactory {

    public MotorVehicle create() {
        return createMotorVehicle();
    }

    protected abstract MotorVehicle createMotorVehicle();
}
