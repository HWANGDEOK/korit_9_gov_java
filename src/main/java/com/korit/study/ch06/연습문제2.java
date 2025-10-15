package com.korit.study.ch06;

public class 연습문제2 {
    public static void main(String[] args) {
        System.out.println(add(5, 6));
        System.out.println(add(10.2, 452.7));
        System.out.println(add(2,5,1));

        printInfo("황현덕");
        printInfo("황현덕", 26);
        printInfo("황현덕", 26, "부산대학교");
    }

    // 정수 2개를 더하는 함수
    public static int add(int a, int b) {
        return a + b;
    }

    // 실수 2개를 더하는 함수를 오버로딩으로 작성하세요
    public static double add(double a, double b) {
        // 여기에 코드 작성
        return a + b;
    }

    // 정수 3개를 더하는 함수를 오버로딩으로 작성하세요
    public static int add(int a, int b, int c) {
        // 여기에 코드 작성
        return a + b + c;
    }

    // 이름만 출력하는 함수
    public static void printInfo(String name) {
        System.out.println("이름: " + name);
    }

    // 이름과 나이를 출력하는 함수를 오버로딩으로 작성하세요
    public static void printInfo(String name, int age) {
        printInfo(name);
        System.out.println("나이: " + age);
    }
    // 이름, 나이, 학교를 출력하는 함수도 오버로딩으로 작성하세요
    public static void printInfo(String name, int age, String schoolName) {
        printInfo(name, age);
        System.out.println("학교: " + schoolName);
    }
}
