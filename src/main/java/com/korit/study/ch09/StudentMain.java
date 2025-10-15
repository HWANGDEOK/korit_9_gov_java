package com.korit.study.ch09;

class Student {
    String name;
    int age;
    boolean sx;
    void printInfo() {
        System.out.println("학생 정보 출력");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.printf("성별: %s\n", sx ? "남" : "여");
    }
}

public class StudentMain {
    // 2명의 학생정보를 객체를 사용하여 정의하고 출력하는 프로그램을 작성하시오.
    /*
        이름: 황현덕
        나이: 26
        성별: 남(true)

        이름: 김아름
        나이: 24
        성별: 여(false)
     */
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "황현덕";
        s1.age = 26;
        s1.sx = true;


        Student s2 = new Student();
        s2.name = "김아름";
        s2.age = 24;
        s2.sx = false;

        s1.printInfo();
        System.out.println();
        s2.printInfo();
    }

}


