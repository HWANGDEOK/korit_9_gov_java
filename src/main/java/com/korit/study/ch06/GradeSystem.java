package com.korit.study.ch06;

public class GradeSystem {
    public static void main(String[] args) {
        GradeSystem.printStudentInfo("홍길동", 80, 85, 90);
        GradeSystem.printStudentInfo("김철수", 95, 88);
    }
    // 평균을 계산하는 함수 (정수 2개)
    public static double average(int score1, int score2) {
        // 구현하세요
        double sum = score1 + score2;
        return sum / 2;
    }

    // 평균을 계산하는 함수 (정수 3개) - 오버로딩
    public static double average(int score1, int score2, int score3) {
        // 구현하세요
        double sum = score1 + score2 + score3;
        return sum / 3;
    }

    // 등급을 반환하는 함수
    public static char getGrade(double average) {
        // 90이상: A, 80이상: B, 70이상: C, 그 외: F
        // 구현하세요
        char grade = average >= 90 ? 'A' :
                            average >= 80 ? 'B' :
                                    average >= 70 ? 'C' : 'F';
        return grade;
    }

    // 학생 정보를 출력하는 함수
    public static void printStudentInfo(String name, int score1, int score2, int score3) {
        // average()와 getGrade() 함수를 호출하여 학생 정보를 출력하세요
        // 출력 형식: "홍길동 학생의 평균: 85.0, 등급: B"
        double avg = GradeSystem.average(score1, score2, score3);
        char grd = GradeSystem.getGrade(avg);
        System.out.printf("%s 학생의 평균: %.1f, 등급: %c\n", name, avg, grd);
    }

    public static void printStudentInfo(String name, int score1, int score2) {
        // average()와 getGrade() 함수를 호출하여 학생 정보를 출력하세요
        // 출력 형식: "홍길동 학생의 평균: 85.0, 등급: B"
        double avg = GradeSystem.average(score1, score2);
        char grd = GradeSystem.getGrade(avg);
        System.out.printf("%s 학생의 평균: %.1f, 등급: %c\n", name, avg, grd);
    }
}
