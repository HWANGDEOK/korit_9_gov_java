package com.korit.study.ch28;

interface ClickListener {
    void onClick();
}

class Button{
    private ClickListener listener;

    public void setClickListener(ClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        if (listener != null) {
            listener.onClick();
        }
    }
}

interface Calculator {
int calculate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        button.setClickListener(new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("버튼이 클릭되었습니다!");
            }
        });
        button.click();

        Button shopButton = new Button();
        shopButton.setClickListener(() -> System.out.println("샵 버튼이 클릭됐습니다."));




        int x = 10;
        int y = 5;

        // TODO: 익명 클래스로 덧셈 계산기 구현
        Calculator add = (a, b) -> a + b; // 여기에 구현

        // TODO: 익명 클래스로 뺄셈 계산기 구현
        Calculator subtract = (a, b) -> a - b; // 여기에 구현

        // TODO: 익명 클래스로 곱셈 계산기 구현
        Calculator multiply = (a, b) -> a * b; // 여기에 구현

        System.out.println(x + " + " + y + " = " + add.calculate(x, y));
        System.out.println(x + " - " + y + " = " + subtract.calculate(x, y));
        System.out.println(x + " * " + y + " = " + multiply.calculate(x, y));
    }

}
