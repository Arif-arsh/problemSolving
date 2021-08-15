package com.arif;

import java.util.Scanner;

public class CountingOccurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number ");
        int num = in.nextInt();
        System.out.println("Enter the occurred digit you want to find ");
        int occurD = in.nextInt();
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == occurD) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}
