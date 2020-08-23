package com.company;

public class Main {
    public static void main(String[] args) {
        //write your code here
        int temp = func(8,2);
        System.out.println(temp);
    }
    public static int func(int a, int b) {
        int res = 1;
        for (int i = 0; i < b; i++) {
            res *= a;
        }
        return res;
    }
}
