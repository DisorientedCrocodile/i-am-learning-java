package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        int[] nums;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how long you want the array to be: ");
        n = scanner.nextInt();
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter nums[" + i + "]");
            nums[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(i + ". " + nums[i]);
        }
        // i know VEERYY UsEfUl
    }
}
