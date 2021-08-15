package com.arif;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = in.nextInt();
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            ans = ans * 10 + rem;
            num /= 10;
        }
        System.out.println("Reverse number is: " + ans);
    }
}
