package com.alex.jdeveloper;

public class PrintStars implements PrintAnswerInStars {
    @Override
    public void printAnswer(int number) {
       for (int j = 0; j < number; j++) {
           System.out.print("*");
       }
        System.out.println();
    }
}