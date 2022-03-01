package com.alex.jdeveloper;

public class TV implements IDoUsefulJob, IConsumeSomeElEnergy {
    public void doJob(){
        System.out.println("TV is playing film.");
    }

    public void consumeEEnergy(){
        System.out.println("TV consumpts 300 Wt.");
    }
}
