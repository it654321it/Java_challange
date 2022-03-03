package com.alex.jdeveloper;

import java.util.Scanner;

public class DataInOut implements DataOutInterface, DataReaderInterface {
    private Scanner scanner;

    public DataInOut(Scanner scanner) {
        this.scanner = scanner;
    }

    public DataInOut() {
    }

    @Override
    public void printToConsoleText(String text) {
        System.out.print(text);
    }

    @Override
    public int readNumberFromConsole() {
        return scanner.nextInt();
    }

    @Override
    public void printAnswer(int number) {
        System.out.print(number);
    }
}