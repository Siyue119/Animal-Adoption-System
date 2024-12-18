package main.java.com.test;

import java.util.Scanner;


public class Regx {

    public int  menuItemValidate (int min , int max){
            // define regular expressions for menu items that match any single number from "1" to "9"
            String regex = "^[1-9]$";
            // create a keyboard input object
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the correct number，the minimum is:" + min + "\t" + "the maximum is：" + max);
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                int inputNum = Integer.parseInt(input);
                if (inputNum >= min && inputNum <= max) {
                    return inputNum;
                } else {
                    System.out.println("The number you entered is not in the range, please re-enter!");
                }
            } else {
                System.out.println("Error, please enter a number between " + min + " and " + max);
            }
        }
    }
}