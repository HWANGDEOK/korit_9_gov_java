package com.korit.study.ch04;

import java.util.Scanner;

public class Controller02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("이름: ");
        String name = scanner.nextLine();

        switch (name) {
            case "김김김" :
                System.out.println("1");
                break;
            case "박박박" :
                System.out.println("2");
                break;
            case "이이이" :
                System.out.println("3");
                break;
            default:
                System.out.println("나머지");
        }
    }
}
