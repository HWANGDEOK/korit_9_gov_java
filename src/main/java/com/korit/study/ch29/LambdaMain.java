package com.korit.study.ch29;

/**
 * Lambda(람다) - 익명함수
 * 1. 하나의 추상 메서드
 * 2. 생성자 호출 부분이 생략된다. new 키워드 사용을 하지 않고 생성함.
 * 3. 매개변수의 자료형을 생략하여 재정의 할 수 있다.
 * 4. 매개변수가 하나면 () 소괄호를 생략할 수 있다.
 * 5. 리턴 자료형을 명시하지 않아도 된다.
 * 6. 실행할 명령문이 한 줄이면 {} 중괄호를 생략할 수 있다.
 *      이때 리턴 값이 있는 경우 return 키워드도 같이 생략하여야한다.
 *      중괄호와 return 키워드는 세트.
 */


interface LambdaStudy {
    int calc(int a, int b, int c);
}

interface LambdaStudy2 {
    void calc(int a);
}

interface LambdaStudy3 {
    int calc();
}

public class LambdaMain {
    public static void main(String[] args) {
        LambdaStudy s1 = new LambdaStudy() {
            @Override
            public int calc(int a, int b, int c) {
                System.out.println("익명 클래스 사용");
                return a * b - c;
            }
        };
        System.out.println(s1.calc(10, 5, 2));

/// ////////////////////////////////////////////////////////////////
        // 생성자 호출 부분 -> 기호로 대체
        LambdaStudy s2 = (int a, int b, int c) -> {
                System.out.println("익명 클래스 사용");
                return a * b - c;
        };
        System.out.println(s2.calc(10, 5, 2));

        // 매개변수 자료형 생략 가능,
        // 람다가 아니더라도 오버라이드(재정의)는 매개변수명도 변경 가능
        LambdaStudy s3 = (aa, bb, cc) -> {
            System.out.println("익명 클래스 사용");
            return aa * bb - cc;
        };
        System.out.println(s3.calc(10, 5, 2));

        // 실행문이 하나면 함수 내용을 감싸는 {} 중괄호 생략가능
        // 매개변수가 하나면 () 소괄호 생략가능
        LambdaStudy2 s4 = num ->  System.out.println(num);
        s4.calc(100);


        // 실행문이 하나인데 리턴 값이면 {} 중괄호와 return 키워드 생략가능
        // 매개변수가 없으면 () 소괄호 필수
        int n1 = 10;
        int n2 = 30;
        LambdaStudy3 s5 = () ->  n1 * n2;
        System.out.println(s5.calc());
    }
}