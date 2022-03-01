package com.alex.jdeveloper;

public class DishWashingMachine implements IDoUsefulJob, IConsumeSomeElEnergy {
    public void doJob() {
        System.out.println("DSM is washing dishes each day.");
    }

    public void consumeEEnergy() {
        System.out.println("DSM consumes 500 Wt.");
    }
}