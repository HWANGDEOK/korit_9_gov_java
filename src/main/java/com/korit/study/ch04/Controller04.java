package com.korit.study.ch04;

public class Controller04 {
    public static void main(String[] args) {


        for (int i = 0; i < 20; i++){
            int n = i + 1;
            if (n % 2 == 0) System.out.println(n + "=짝");
            else if (i % 2 == 1){
                System.out.println(n + "=홀");
            }

            if (n % 2 == 0) {
                System.out.println(n + "=짝");
                continue;
            }
            System.out.println(n + "=홀");
        }

//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }
    }
}
