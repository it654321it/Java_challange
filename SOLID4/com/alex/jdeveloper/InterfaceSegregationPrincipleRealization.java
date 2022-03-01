package com.alex.jdeveloper;

public class InterfaceSegregationPrincipleRealization {

    public static void main(String[] args) {
        System.out.println("This App demonstrates realization of Interface Segregation principle.");

        TV tv1 = new TV();
        DishWashingMachine dwm1 = new DishWashingMachine();

        tv1.doJob();
        tv1.consumeEEnergy();

        dwm1.doJob();
        dwm1.consumeEEnergy();
    }
}