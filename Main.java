package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner terminalUser = new Scanner(System.in);

        System.out.println("You can enter to Terminal any words you want:... ");
        System.out.println("You entered next words: " + terminalUser.nextLine());
    }
}