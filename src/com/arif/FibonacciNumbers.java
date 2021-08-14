package com.arif;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the starting number of fibo series: ");
        int a = in.nextInt();
        System.out.println("Enter the next number of fibo series: ");
        int b = in.nextInt();
        System.out.println("Enter the nth number to find fibo series: ");
        int n = in.nextInt();
        int count = 2;
        while (count <= n) {
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
