package oldVersionOfApp;

import java.util.Scanner;

public class AppWithoutSolidPrinciples {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        //int firstNum = scaner.nextInt();
        int firstNum = 4;
        System.out.println("Enter 2nd number: ");
        //int secondNum = scaner.nextInt();
        int secondNum = 10;
        
        int result = firstNum + secondNum;

        System.out.println("Sum of " + firstNum + " and " + secondNum + " is: " + result);
    }
}