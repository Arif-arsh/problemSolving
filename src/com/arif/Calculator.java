package com.arif;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //take input from the user till user does not press x or X
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.println("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                //input two numbers
                System.out.println("Enter first number: ");
                int num1 = in.nextInt();
                System.out.println("Enter second number: ");
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 +num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operation!!");
            }
            System.out.println(ans);
        }
    }
}
