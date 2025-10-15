package com.korit.study.ch08;

import java.util.Scanner;

public class ProductView {

    public static String[] productNames = new String[] {"갤럭시1", "갤럭시2", "갤럭시3", "갤럭시4", "갤럭시5", "갤럭시6", "갤럭시7"};
    public static int[] prices = new int[] {10000, 20000, 30000, 40000, 50000, 60000, 70000};

    public static void main(String[] args) {
        System.out.println("상품 관리 시스템");
        showMainMenuView();
    }

    public static void showMainMenuView() {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            System.out.println("1. 상품 추가");
            System.out.println("2. 상품 조회");
            System.out.println("3. 상품 수정");
            System.out.println("4. 상품 삭제");
            System.out.println("0. 종료");
            System.out.print("선택: ");
            int selectedNumber = scanner.nextInt();
            scanner.nextLine();

            switch (selectedNumber) {
                case 0:
                    isExit = true;
                    break;
                case 1:
                    registerProduct();
                    break;
                case 2:
                    showProductList();
            }
        }
    }

    public static void registerProduct() {
        Scanner scanner = new Scanner(System.in);
        String newProduct;
        int newPrice;
        while (true) {
            System.out.println("[상품 추가]");
            System.out.print("상품 이름 입력: ");
            newProduct = scanner.nextLine();
            if (findByName(newProduct)) break;
            System.out.println("이미 존재하는 이름입니다. 다시 입력하세요.");

        }
        addProduct(newProduct);
        System.out.println("상품 가격 입력: ");
        newPrice = scanner.nextInt();
        addPrice(newPrice);
        System.out.println("<< 상품 추가 완료 >>");
    }

    public static void addProduct(String name) {
        String[] newArray = new String[productNames.length + 1];
        for (int i = 0; i < productNames.length; i++) {
            newArray[i] = productNames[i];
        }
        newArray[newArray.length - 1] = name;
        productNames = newArray;
    }

    public static void addPrice(int price) {
        int[] newPriceArray = new int[prices.length + 1];
        for (int i = 0; i < prices.length; i++) {
            newPriceArray[i] = prices[i];
        }
        newPriceArray[newPriceArray.length - 1] = price;
        prices = newPriceArray;
    }

    public static boolean findByName(String name) {
        for (String n : productNames) {
            if (n.equals(name)) return true;
        }
        return false;
    }


    public static void showProductList() {
        Scanner scanner = new Scanner(System.in);
        int size = 2;
        while (true) {
            System.out.println("사용자 정보 조회");
            System.out.println("뒤로가려면 0을 입력하세요.");
            System.out.printf("페이지 번호 입력(1 ~ %d): ", getLastPage(size));
            int selectedPage = scanner.nextInt();
            scanner.nextLine();

            if (selectedPage == 0) {
                break;
            } else if (selectedPage > getLastPage(size)) {
                System.out.println("해당 페이지는 찾을 수 없습니다.");
            } else {
                String[] nameOfPagination = paginationProduct(selectedPage, size);
                int[] priceOfPagination = paginationPrice(selectedPage, size);
                for (int i = 0; i < nameOfPagination.length; i++) {
                    System.out.printf("%d. %s: %,d원\n", i + 1, nameOfPagination[i], priceOfPagination[i]);
                }
                System.out.println();
                System.out.println("수정 사항이 있으십니까? (Y/N)");
                System.out.println("상품 이름을 수정하시겠습니까? (Y/N)");
                System.out.printf("수정하시려는 상품의 번호를 입력하세요(1 ~ %d)\n", nameOfPagination.length);
                int updateIdx = scanner.nextInt();
                nameOfPagination[updateIdx] = scanner.nextLine();
                System.out.println("가격도 수정하시겠습니까? (Y/N)");
                priceOfPagination[updateIdx] = scanner.nextInt();
            }
        }
    }


    public static int getLastPage(int size) {
        return productNames.length % size == 0 ? productNames.length / size : productNames.length / size + 1;
    }

    public static String[] paginationProduct(int page, int size) {
        int startIndex = (page - 1) * size;
        int lastPage = getLastPage(size);
        boolean isLast = page == lastPage;
        int paginationArraySize = isLast && productNames.length % size != 0 ? productNames.length % size : size;
        String[] paginationArray = new String[paginationArraySize];
        for (int i = startIndex; i < startIndex + paginationArraySize; i++) {
            paginationArray[i - startIndex] = productNames[i];
        }
        return paginationArray;

    }

    public static int[] paginationPrice(int page, int size) {
        int startIndex = (page - 1) * size;
        int lastPage = getLastPage(size);
        boolean isLast = page == lastPage;
        int paginationArraySize = isLast && prices.length % size != 0 ? prices.length % size : size;
        int[] paginationArray = new int[paginationArraySize];
        for (int i = startIndex; i < startIndex + paginationArraySize; i++) {
            paginationArray[i - startIndex] = prices[i];
        }
        return paginationArray;

    }


}
