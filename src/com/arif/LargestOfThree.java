package com.arif;

import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers: " );
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        //Approach 1
//        int max = num1;
//        if (num2 > max) {
//            max = num2;
//        }
//        if (num3 > max) {
//            max = num3;
//        }

//        Aproach2
//        int max = 0;
//        if (num1 > num2) {
//            max = num1;
//        } else {
//            max = num2;
//        }
//        if (num3 > max) {
//            max = num3;
//        }

        //Approach3
        int max = Math.max(num3 , Math.max(num1 , num2));
        System.out.println(max);
    }
}
