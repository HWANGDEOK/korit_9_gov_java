package com.korit.study.ch03;

import java.util.Scanner;

public class StudentInfoSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 여기에 코드를 작성하세요
        // next(), nextInt(), nextLine() 모두 사용
        int studentAge = 0;
        int studentGrade = 0;
        double korScore = 0;
        double engScore = 0;
        double matScore = 0;
        System.out.print("학생 이름을 입력하세요: "); String studentName = scanner.nextLine();
        System.out.print("나이를 입력하세요: "); studentAge = scanner.nextInt();
        System.out.print("학년을 입력하세요: "); studentGrade = scanner.nextInt();
        System.out.print("국어 점수를 입력하세요: "); korScore = scanner.nextDouble();
        System.out.print("영어 점수를 입력하세요: "); engScore = scanner.nextDouble();
        System.out.print("수학 점수를 입력하세요: "); matScore = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("자기소개를 입력하세요: ");; String studentIntro = scanner.nextLine();

        double totalScore = korScore + engScore + matScore;
        double avg = totalScore / 3;
        String grade = avg >= 95 ? "A+" :
                            avg >= 90 ? "A" :
                                    avg >= 85 ? "B+" :
                                            avg >= 80 ? "B" :
                                                    avg >= 75 ? "C+" :
                                                            avg >= 70 ? "C" :
                                                                    avg >= 65 ? "D+" :
                                                                            avg >= 60 ? "D" : "F";

        System.out.println("\n=== 학생 정보 ===");
        System.out.println("이름: " + studentName);
        System.out.printf("나이: %d세 (고등학교 %d학년)\n", studentAge, studentGrade);
        System.out.printf("""
                성적:
                    국어: %.0f점
                    영어: %.0f점
                    수학: %.0f점
                    평균: %.2f점 (학점: %s)
                """, korScore, engScore, matScore, avg, grade);
        System.out.println("자기소개: " + studentIntro);


        scanner.close();
    }
}
