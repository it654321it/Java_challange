package com.alex.jdeveloper;

import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class SolidPrinciplesApp {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("numbers.txt");

        Scanner scanner = new Scanner(file);

        DataOutInterface data = new DataInOut();
        DataReaderInterface text = new DataInOut(scanner);
        PrintAnswerInStars stars = new PrintStars();

        OperationInterface sum = new SomeOperation();

        ModelApp model = new ModelApp();
        model.initProg(text, data);
        model.calc(sum);

        model.starsInAnswer(stars);
    }
}