package oldVersionOfApp;

import java.util.Scanner;

public class AppWithoutSolidPrinciples {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int firstNum = scaner.nextInt();
        System.out.println("Enter 2nd number: ");
        int secondNum = scaner.nextInt();
        
        int result = firstNum + secondNum; // variant #1 - summation
		//int result = firstNum - secondNum; // variant #2 - subtraction
		//int result = firstNum * secondNum; // variant #3 - multiplying
		//int result = firstNum / secondNum; // variant #4 - dividing

        System.out.println("Sum (sub/mul/div) of " + firstNum + " and " + secondNum + " is: " + result);
    }
}