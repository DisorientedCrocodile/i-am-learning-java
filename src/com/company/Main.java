package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    // write your code here
        Scanner num = new Scanner(System.in); // a Scanner object
        int first, second, result;
        System.out.println("Enter first num: ");
        first = num.nextInt(); // takes an int as input
        System.out.println("Enter second num: ");
        second = num.nextInt(); // same here
        result = first + second; // can be + - * / or %
        // if i wanted to add an int to another int i could do result += first
        // there also are -= *= /=
        // if i want to add 1 i can do result++;
        // if i need to subtract 1 i could do result--;
        System.out.println("The result is: " + result);
    }
}
