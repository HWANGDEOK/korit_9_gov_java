package com.korit.study.ch06;

public class 연습문제3 {
    public static void main(String[] args) {
        double celsius = 37.0;
        checkTemperatureConversion(celsius);
        System.out.println(calculate(1,7,5,7));
    }

    // 섭씨를 화씨로 변환하는 함수
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    // 화씨를 섭씨로 변환하는 함수
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // 섭씨 온도를 받아서 화씨로 변환한 후, 다시 섭씨로 변환하여
    // 원래 값이 맞는지 확인하는 함수를 작성하세요
    public static void checkTemperatureConversion(double celsius) {
        // 여기에 중첩 함수 호출 코드 작성
        double celToFa = celsiusToFahrenheit(celsius);
        double faToCel = fahrenheitToCelsius(celToFa);
//        if (celToFa == faToCel) {
//            System.out.println("같음");
//        } else {
//            System.out.println("같지 않음");
//        }
        System.out.println(celsius == faToCel ? "같음" : "같지 않음");
    }

    public static int add(int a, int b) { return a + b; }
    public static int multiply(int a, int b) { return a * b; }
    public static int subtract(int a, int b) { return a - b; }

    // (a + b) * c - d 를 계산하는 함수를
    // 위의 함수들을 이용해서 작성하세요
    public static int calculate(int a, int b, int c, int d) {
        // 여기에 중첩 함수 호출 코드 작성
//        int ab = add(a, b);
//        int abc = multiply(ab, c);
//        int abcd = subtract(abc, d);
//
//        return abcd;
        return subtract(multiply(add(a, b), c), d);
    }
}
