package com.korit.study.ch04;

import java.util.Scanner;

public class Controller06 {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("i = " + i);
//            for (int j = 0; j < i; j++){
//                System.out.println("j = " + j);
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        int startDan = 0;
        int endDan = 0;

        // 여기에 코드를 작성하세요
        // 입력 순서와 Scanner 메서드 조합에 주의
        startDan = scanner.nextInt();
        endDan = scanner.nextInt();

        for (int i = 0; i < endDan-startDan+1; i++) {
            int n = endDan - i;
            System.out.println(n + "단");
            for (int j = 0; j < 9; j++) {
                int m = 9-j;
                System.out.println(n + " x " + m + " = " + n*m);
            }
        }

        scanner.close();

        /* 구구단 */
    }
}
