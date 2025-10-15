package com.korit.study.ch10;

public class ClassAMain {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.name = "황현덕";
        a.age = 26;

        ClassB b = new ClassB("김이", 33);
        System.out.println(b.name);

        ClassC c = new ClassC("ㅁㅁㅇㅁ", 26, "ㅇㅂㅈ");
        ClassC c2 = new ClassC("ㅁㅁㅇㅁ");
    }

}
