package com.korit.study.ch07;

import java.util.Random;
import java.util.Scanner;

public class LottoNumber {
    public static int[] inputNums() {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[0];
        for (int i = 0; i < 6; i++) {
            while (true) {
                System.out.print((i + 1) + "번 숫자 입력: ");
                int inputValue = scanner.nextInt();
                if (inputValue > 0 && inputValue < 46) {
                    boolean isFind = false;
                    for (int j = 0; j < nums.length; j++) {
                        if (nums[j] == inputValue) {
                            isFind = true;
                            break;
                        }
                    }

                    if (isFind) {
                        System.out.println("중복된 번호입니다.");
                        continue;
                    }

                    int[] newNums = new int[nums.length + 1];
                    for (int j = 0; j < nums.length; j++) {
                        newNums[j] = nums[j];
                    }
                    newNums[newNums.length - 1] = inputValue;
                    nums = newNums;
                    break;
                }
                System.out.println("숫자는 1 ~ 45까지만 입력할 수 있습니다.");
            }
        }
        return nums;
    }

    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int num : array){
            System.out.print(num + " ");
        }
        System.out.println("]");
    }



    public static int[] lottoNumGenerate() {
        Random random = new Random();
        int[] lottoNumber = new int[7];
        for (int i = 0; i < lottoNumber.length; i++) {
            while (true) {
                int newNumber = random.nextInt(45) + 1;
                boolean isFind = false;
                for (int j = 0; j < lottoNumber.length; j++) {
                    if (lottoNumber[j] == newNumber) {
                        isFind = true;
                        break;
                    }
                }
                if (!isFind) {
                    lottoNumber[i] = newNumber;
                    break;
                }
            }
        }
        return lottoNumber;
    }


    public static void lottoRanker(int[] lottoNumber, int[] nums) {
        int 당첨개수 = 0;
        boolean 보너스당첨 = false;
        for (int i = 0; i < lottoNumber.length; i++) {
            for (int j = 0; j < nums.length; j ++) {
                if (nums[j] == lottoNumber[i] && i < lottoNumber.length - 1) {
                    당첨개수++;
                }else if (nums[j] == lottoNumber[i]) {
                    보너스당첨 = true;
                }
            }
        }
        numOfWin(당첨개수, 보너스당첨);
    }

    public static void numOfWin(int num, boolean bonus) {
        if (num == 6) {
            System.out.println("1등");
        } else if (num == 5 && bonus) {
            System.out.println("2등");
        } else if (num == 5) {
            System.out.println("3등");
        } else if (num == 4) {
            System.out.println("4등");
        } else if (num == 3) {
            System.out.println("5등");
        } else {
            System.out.println("꽝");
        }
    }


    public static void main(String[] args) {

        int [] lottoNumber = lottoNumGenerate();
        printArray(lottoNumber);

        int[] nums = new int[0];
        nums = inputNums();

        printArray(nums);

        lottoRanker(lottoNumber, nums);

    }
}
