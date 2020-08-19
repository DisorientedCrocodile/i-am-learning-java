package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    // write your code here
        Scanner num = new Scanner(System.in); // a Scanner object
        int first, second = 50;
        System.out.println("Enter 1st num: ");
        first = num.nextInt();

        if (first > second) { // found out it actually works without brackets if its only one line lol
            System.out.println("bigger than 50");
            System.out.println("\n");
        } else if (first == second) {
            System.out.println("same as 50");
        }
        else {
            System.out.println("lower than 50");
        }

        switch (first) {
            case 51:
            case 123:
                System.out.println(first);
                break;
            case 56:
                System.out.println("56 lol");
            default:
                System.out.println("not 51 123 or 56");
        }

        // not much since it's pretty much the same with c-sharp
    }
}
