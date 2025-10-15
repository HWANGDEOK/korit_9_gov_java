package com.korit.study.ch07;

import java.util.Scanner;

public class ArrayListFunction {

    public static void printNameAll(String[] names) {
        if (names.length == 0) {
            System.out.println("등록된 이름이 없습니다.");
        } else {
            for (int i = 0; i < names.length; i++) {
                System.out.println("이름(" + (i + 1) + "): " + names[i]);
            }
        }
    }

    public static String inputName(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름 입력: ");
        return scanner.nextLine();
    }

    public static String[] addInputNameToNames(String[] names){
        String name= inputName();
        return addToArray(name, names);
    }

    public static String[] addToArray(String value, String[] cuurentArray){
        String[] newArray = new String[cuurentArray.length + 1];
        for (int i = 0; i < cuurentArray.length; i++) {
            newArray[i] = cuurentArray[i];
        }
        newArray[newArray.length - 1] = value;
        return newArray;
    }


    public static void main(String[] args) {

        String[] names = new String[0];

        printNameAll(names);
        names = addInputNameToNames(names);
        printNameAll(names);
        names = addInputNameToNames(names);
        printNameAll(names);
        names = addInputNameToNames(names);

        printNameAll(names);
    }
}
