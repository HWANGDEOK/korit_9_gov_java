package com.korit.study.ch06;

public class Function02 {

    public static void main(String[] args) {
        fx1();
        fx1();
        fx2("황현덕", 80);
        fx3("황현덕", 60);
        int[] arr1 = fx4();
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        int[] arr2 = fx5(5);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

    static void fx1() {
        int num1 = 10;
        int num2 = 20;
        int result = 0;
        for (int i = 0; i < 5; i++) {
            result += num1;
            result += num2;
        }
        System.out.println(result);
    }

    static void fx2(String name, int age) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }

    static void fx3(String a, int b) {
        System.out.println("이름: " + a);
        System.out.println("나이: " + b);
    }

    static int[] fx4() {
        int[] result = new int[0];
        int size = 10;

        for (int i = 0; i < size; i++) {
            int[] temp = new int[result.length + 1];
            for (int j = 0; j < result.length; j++) {
                temp[j] = result[j];
            }
            temp[temp.length - 1] = i + 1;
            result = temp;
        }
        return result;
    }

    static int[] fx5(int size) {
        int[] result = new int[0];
        for (int i = 0; i < size; i++) {
            int[] temp = new int[result.length + 1];
            for (int j = 0; j < result.length; j++) {
                temp[j] = result[j];
            }
            temp[temp.length - 1] = i + 1;
            result = temp;
        }
        return result;
    }

    static void printInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
