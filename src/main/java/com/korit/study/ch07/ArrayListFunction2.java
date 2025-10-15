package com.korit.study.ch07;

import java.util.Scanner;


public class ArrayListFunction2 {

    public static int inputNum(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("복권 번호 입력: ");
        int num = scanner.nextInt();
        while (num < 1 || num > 45) {
            System.out.print("번호 다시 입력(1 ~ 45의 숫자만 입력하세요): ");
            num = scanner.nextInt();
        }
        return num;
    }

    public static int[] addInputNumToNums(int[] nums){
        int num = inputNum();
        return addToArray(num, nums);
    }

    public static int[] addToArray(int value, int[] cuurentArray){
        int[] newArray = new int[cuurentArray.length + 1];
        for (int i = 0; i < cuurentArray.length; i++) {
            newArray[i] = cuurentArray[i];
        }
        newArray[newArray.length - 1] = value;
        return newArray;
    }

    public static void printNumAll(int[] nums) {
        if (nums.length == 0) {
            System.out.println("등록된 번호가 없습니다.");
        } else {
            for (int i = 0; i < nums.length; i++) {
                System.out.println("번호(" + (i + 1) + "): " + nums[i]);
            }
        }
    }

    public static void main(String[] args) {
        // 복권번호 6자리 입력 1 ~ 45
        int[] nums = new int[0];

        for (int i = 0; i < 6; i++) {
            nums = addInputNumToNums(nums);
        }
        printNumAll(nums);

    }
}
