package com.korit.study.ch06;

import java.util.Date;

public class 연습문제1 {
    public static void main(String[] args) {
        Date time = new Date();
        hello();
        callName("현덕");
        System.out.println(square(10));
        System.out.println(nowTime(time.getHours(), time.getMinutes()));
    }

    // 매개변수 없음, 리턴값 없음
    // "안녕하세요!"를 출력하는 함수를 작성하세요
    public static void hello() {
        // 여기에 코드 작성
        System.out.println("안녕");
    }

    // 매개변수 있음, 리턴값 없음
    // 이름을 받아서 "안녕하세요, [이름]님!"을 출력하는 함수를 작성하세요
    public static void callName(String name) {
        // 여기에 코드 작성
        System.out.printf("안녕하세요, %s님!\n", name);
    }

    // 매개변수 있음, 리턴값 있음
    // 정수를 받아서 제곱값을 반환하는 함수를 작성하세요
    public static int square(int number) {
        // 여기에 코드 작성
        return number * number;
    }

    // 매개변수 없음, 리턴값 있음
    // 현재 시간을 "현재 시간입니다"라는 문자열로 반환하는 함수를 작성하세요
    public static String nowTime(int hours, int minutes) {
        // 여기에 코드 작성
        Date now = new Date();
        int nowHour = now.getHours();
        int nowMinutes = now.getMinutes();
        return hours == nowHour && minutes == nowMinutes ? "현재 시간입니다." : "현재 시간이 아닙니다.";
    }


}
