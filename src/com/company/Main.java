package com.company;

public class Main {
    public static void main(String[] args) {
        // write your code here
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        int j = 1;
        while(j <= 10) {
            System.out.println(j);
            j++;
            if (j == 5) {
                break; // gets out of the loop (there's also return)
                // continue; can skip an iteration of a loop
            }
        }

        int x = 0;
        do { // quote from portal 2: "They said i couldn't buy 7 dollars worth of moon rocks much less 70 million.
            //  BOUGHT 'EM ANYWAY"
            x++;
            System.out.println(x);
        } while (x < 0);
    }
}
