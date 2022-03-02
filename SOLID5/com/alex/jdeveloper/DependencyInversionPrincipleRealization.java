package com.alex.jdeveloper;

public class DependencyInversionPrincipleRealization {

    public static void main(String[] args) {
        System.out.println("This App demonstrates realization of 'Dependency Inversion' principle.");

        Mammal cat = new Mammal(new CatNoise());
        Mammal dog = new Mammal(new DogNoise());

        System.out.println("Cat makes such noise: " + cat.makeNoise() + ".");
        System.out.println("Dog makes such noise: " + dog.makeNoise() + ".");
    }
}
