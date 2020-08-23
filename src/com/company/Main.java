package com.company;

public class Main {
    public static void main(String[] args) {
        // write your code here
        int[][] array = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = i + j; // idk i just put a random thing here
                System.out.println(array[i][j]);
            }
        }
    }
}
