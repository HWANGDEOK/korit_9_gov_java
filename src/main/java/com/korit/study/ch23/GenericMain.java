package com.korit.study.ch23;

public class GenericMain {

    public static void main(String[] args) {
        NonGeneric a = new NonGeneric("문자열 데이터");
        NonGeneric b = new NonGeneric(10);
        NonGeneric c = new NonGeneric(new NonGeneric(null));
        NonGeneric d = new NonGeneric(a);
        NonGeneric[] arr = {a, b, c, d};
        for (NonGeneric n : arr) {
            System.out.println(n.getData().getClass());
            if (n.getData() instanceof String) {
                String data = (String) n.getData();
                System.out.println(data);
            } else if (n.getData() instanceof NonGeneric data) {
                System.out.println(data.getData());
            }
        }

        Generic<String, Integer> e = new Generic<String, Integer>("문자열 데이터", "str", 3.14, 10);
        Generic<String, Integer> f = new Generic<>("문자열 데이터", "str", 3.14, 10);

        Object[] arr2 = new Object[1];
    }
}
