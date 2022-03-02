package com.alex.jdeveloper;

public class Mammal {
    IMakeNoise noise;

    public Mammal(IMakeNoise noise) {
         this.noise = noise;
    }

    public String makeNoise() {
        return noise.makeNoise();
    }
}