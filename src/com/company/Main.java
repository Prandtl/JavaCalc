package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Write operation name.");
        String userInput = scanner.nextLine();
        System.out.println(userInput);

        System.out.print("Input first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Input second number: ");
        double secondNumber = scanner.nextDouble();


        System.out.println(firstNumber);
        System.out.println(secondNumber);

        double result = 0;

        switch (userInput){
            case "add":
                result = firstNumber + secondNumber;
                break;
            case "subtract":
                result = firstNumber - secondNumber;
                break;
            case "multiply":
                result = firstNumber * secondNumber;
                break;
            case "divide":
                result = firstNumber / secondNumber;
                break;
        }

        System.out.println(result);
    }
}
