package com.korit.study.ch03;

import java.util.Scanner;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 여기에 코드를 작성하세요
        // 입력 순서와 Scanner 메서드 조합에 주의
        String costomerId = "";
        String productId = "";
        String productName = "";
        int quantity = 0;
        int price = 0;
        int mailCode = 0;
        String address = "";

        System.out.print("고객 ID를 입력하세요: "); costomerId = scanner.next();
        System.out.print("상품코드를 입력하세요: "); productId = scanner.next();
        scanner.nextLine();
        System.out.print("상품명을 입력하세요: "); productName = scanner.nextLine();
        System.out.print("수량을 입력하세요: "); quantity = scanner.nextInt();
        System.out.print("단가를 입력하세요: "); price = scanner.nextInt();
        System.out.print("우편번호를 입력하세요: "); mailCode = scanner.nextInt();
        scanner.nextLine();
        System.out.print("배송주소를 입력하세요: "); address = scanner.nextLine();

        int totPrice = price * quantity;
        boolean isdeliverFee = totPrice < 30000;
        int deliverFee = isdeliverFee ? 3000 : 0;
        String deliverState = isdeliverFee ? "무료 (3만원 이상 구매)" : "유료 (3만원 이상 구매시 무료)";
        int finalPrice = totPrice + deliverFee;



        System.out.printf("""
                === 주문 확인서 ===
                고객 ID: %s
                상품 정보:
                  - 상품코드: %s
                  - 상품명: %s
                  - 단가: %,d원 × %,d개 = %,d원
                배송 정보:
                  - 우편번호: %d
                  - 주소: %s
                  - 배송비: %s
                총 결제 금액: %,d원
                """, costomerId, productId, productName, price, quantity, totPrice, mailCode, address, deliverState, finalPrice);


        scanner.close();
    }
}
