package com.korit.study.ch05;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
//        for (int i = 0; i < 4; i++){
//            for (int j = 0; j < i+1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < 5; i++){
//            for (int j = 0; j < 5-i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < 4; i++){
//            for (int j = 0; j < 4 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < i + 1; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        int n = 10;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n - i - 2; j++) {
//                System.out.print("*");
//            }
//            System.out.print(i == 0 || i == n - 1 ? "" : " ");
//            for (int j = 0; j < i - 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println();

        int n = 9;
        for (int i = 0; i < n; i++) {
            if (i < (n + 1) / 2){
                for (int k = 0; k < n - ((n + 1) / 2) - i; k++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (i * 2) + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int k = 0; k < i - (n - ((n + 1) / 2)); k++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < n - 2 * (i - (n - ((n + 1) / 2))); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        n = n > 0 && n % 2 == 0 ? n + 1 : n;
//
//        int x = (n + 1) / 2;
//        int a = n - x;
//
//        for (int i = 0; i < n; i++) {
//                for (int j = 0; j < (i < x ? a - i : i - a); j++) {
//                    System.out.print(" ");
//                }
//                for (int j = 0; j < (i < x ? (i * 2) + 1 : n - (2 * (i - a))); j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//        }


//        for (int i = 0; i < num; i++) {
//            System.out.println(i < (num / 2) ? (i * 2) + 1 : ((num - i - 1) * 2) +1);
//        }
//
//        for( int i = 0; i < num; i++) {
//            System.out.println(i < (num / 2) ? (num / 2) - i : i - (num / 2));
//        }
    }
}
