package com.korit.study.ch31;

import java.io.IOException;
import java.util.List;

public class ExceptionMain2 {
    public static void main(String[] args){
        List<String> names = List.of("황현일", "황현이");
        try {
            print(null, 3);
        } catch (IOException e) {

        } catch (NullPointerException e) {
            System.out.println("리스트 변수에 null이 들어가 있어");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("배열 크기 넘음");
        } catch (Exception e) {
            System.out.println("최종적으로 모든 예외 처리");
        } finally {
            System.out.println("프로그램 종료");
        }
    }

    public static void print(List<String> names, int size) throws IOException, NullPointerException, ArrayIndexOutOfBoundsException {
        System.out.println(names.size());
        for (int i = 0; i < size; i++) {
            System.out.println(names.get(i));
        }

    }
}
