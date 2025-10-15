package com.korit.study.ch05;

public class PracticeProblem {
    public static void main(String[] args) {

//        // 1
//        int[] nums = new int[] {10, 20, 30, 40, 50};
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(nums[i]);
//        }

//        // 2
//        int[] nums2 = new int[] {5, 10, 15, 20, 25};
//        int sum = 0;
//        for (int i = 0; i < 5; i++) {
//            sum += nums2[i];
//        }
//        System.out.printf("배열 요소들의 합: %d", sum);

//        // 3
//        int[] nums3 = new int[] {23, 45, 12, 67, 34, 89, 11};
//        int maxNum = 0;
//        for (int i = 0; i < 7; i++) {
//            if (maxNum < nums3[i]) {
//                maxNum = nums3[i];
//            }
//        }
//        System.out.printf("배열의 최댓값: %d", maxNum);

//        // 4
//        int[] nums4 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.print("짝수: ");
//        for (int i = 0; i < 10; i++) {
//            if (nums4[i] % 2 == 0) {
//                System.out.print(nums4[i]+" ");
//            }
//        }
//
//        int[] evens = new int[0];
//        for (int i = 0; i < nums4.length; i++) {
//            if (nums4[i] % 2 == 0) {
//                int[] temp = new int[evens.length + 1];
//                for (int j = 0; j < evens.length; j++) {
//                    temp[j] = evens[j];
//                }
//                temp[temp.length - 1] = nums4[i];
//                evens = temp;
//            }
//        }


        // 5
//        int[] nums5 = new int[] {1, 2, 3, 4, 5};
//        for (int i = 0; i < nums5.length; i++) {
//            int n = nums5.length - i - 1;
//            System.out.print(nums5[n] + " ");
//        }

        // 5 - 2
//        int[] nums = { 1, 2, 3, 1, 2, 3, 1, 3, 3};
//        int[] arr1 = new int[0];    // 1들만 모으기
//        int[] arr2 = new int[0];    // 2들만 모으기
//        int[] arr3 = new int[0];    // 3들만 모으기
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 1) {
//                int[] temp = new int[arr1.length + 1];
//                for (int j = 0; j < arr1.length; j++) {
//                    temp[j] = arr1[j];
//                }
//                temp[temp.length - 1] = nums[i];
//                arr1 = temp;
//            } else if (nums[i] == 2) {
//                int[] temp = new int[arr2.length + 1];
//                for (int j = 0; j < arr2.length; j++) {
//                    temp[j] = arr2[j];
//                }
//                temp[temp.length - 1] = nums[i];
//                arr2 = temp;
//            } else if (nums[i] == 3) {
//                int[] temp = new int[arr3.length + 1];
//                for (int j = 0; j < arr3.length; j++) {
//                    temp[j] = arr3[j];
//                }
//                temp[temp.length - 1] = nums[i];
//                arr3 = temp;
//            }
//        }
//        System.out.print("arr1 요소: ");
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i] + " ");
//        }
//        System.out.print("\narr2 요소: ");
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i] + " ");
//        }
//        System.out.print("\narr3 요소: ");
//        for (int i = 0; i < arr3.length; i++) {
//            System.out.print(arr3[i] + " ");
//        }


        // 6
//        int[] nums6 = new int[] {3, 7, 3, 9, 3, 1, 3, 5};
//        int cnt = 0;
//        for (int i = 0; i < nums6.length; i++) {
//            if(nums6[i] == 3) {
//                cnt++;
//            }
//        }
//        System.out.printf("숫자 3의 개수: %d개\n", cnt);

        // 6 - 2
//        int[] grade = { 1, 2, 3, 1 };
//        String[] name = { "철수", "영희", "영철", "길동" };
//        String[] student = new String[0];    //{"철수(1)", "영희(2)", "영철(3)", "길동(1)" }
//
//        for (int i = 0; i < grade.length; i++) {
//            String[] temp = new String[student.length + 1];
//            for (int j = 0; j < student.length; j++){
//                temp[j] = student[j];
//            }
//            temp[temp.length - 1] = name[i] + "(" + grade[i] + ")";
//            student = temp;
//        }
//
//        for(int i = 0; i < student.length; i++) {
//            System.out.print(student[i] + " ");
//        }

        // 6 - 3
//        int[] baseSal = { 10000, 20000, 30000 };
//        double taxRate = 0.15;
//        int [] totalSal = new int[3];
//
//        for (int i = 0; i < baseSal.length; i++) {
//            double tax = baseSal[i] * (1 - taxRate);
//            totalSal[i] = (int) tax;
//        }
//
//        for (int i = 0; i < totalSal.length; i++) {
//            System.out.printf("%,d\n", totalSal[i]);
//        }


//        // 7
//        int[] nums6 = new int[] {80, 90, 75, 85, 95};
//        double sum = 0;
//        double avg = 0;
//        for (int i = 0; i < 5; i++) {
//            sum += nums6[i];
//        }
//        avg = sum / 5;
//        System.out.printf("배열의 평균: %.2f", avg);

//        // 8
//        int[] arr1 = new int[] {1, 2, 3, 4, 5};
//        int[] arr2 = new int[] {6, 7, 8, 9, 10};
//        System.out.print("합 배열: ");
//        for (int i = 0; i < 5; i++) {
//            int sum = arr1[i] + arr2[i];
//            System.out.print(sum + " ");
//        }

//        // 9
//        int[] nums9 = new int[] {45, 23, 67, 12, 89, 34, 78};
//        int minNum = 100;
//        int maxNum = 0;
//
//        for (int i = 0; i < 6; i++) {
//            if (nums9[i] > maxNum) {
//                maxNum = nums9[i];
//            } else if (nums9[i] < minNum) {
//                minNum = nums9[i];
//            }
//        }
//        System.out.printf("최솟값: %d, 최댓값: %d", minNum, maxNum);

//        // 10
//        int[] nums10 = new int[] {85, 92, 78, 96, 88, 73, 99, 82};
//
//        for (int i = 0; i < 8; i++) {
//            int n = i + 1;
//            String grade = nums10[i] >= 90 ? "A" :
//                                nums10[i] >= 80 ? "B" :
//                                    nums10[i] >= 70 ? "C" : "D";
//
//            System.out.printf("학생 %d: %d점 - %s등급\n", n, nums10[i], grade);
//        }
    }
}
