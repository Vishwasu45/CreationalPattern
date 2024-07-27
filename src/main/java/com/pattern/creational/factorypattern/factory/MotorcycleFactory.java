package com.pattern.creational.factorypattern.factory;

import com.pattern.creational.factorypattern.instance.MotorCycle;
import com.pattern.creational.factorypattern.instance.MotorVehicle;

public class MotorcycleFactory extends MotorVehicleFactory {

    @Override
    protected MotorVehicle createMotorVehicle() {
        return new MotorCycle();
    }
}
