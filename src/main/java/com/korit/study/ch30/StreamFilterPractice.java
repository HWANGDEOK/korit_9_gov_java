package com.korit.study.ch30;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;


class Product {
    String name;
    int price;
    // constructor, getters

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class Person_ad {
    String name;
    int age;
    // constructor, getters

    public Person_ad(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Student_f {
    String name;
    int mathScore;
    int englishScore;
    // constructor, getters

    public Student_f(String name, int mathScore, int englishScore) {
        this.name = name;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    public String getName() {
        return name;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }
}

class Item {
    String name;
    int stock;
    boolean onSale;
    int price;
    // constructor, getters

    public Item(String name, int stock, boolean onSale, int price) {
        this.name = name;
        this.stock = stock;
        this.onSale = onSale;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class StreamFilterPractice {
    public static void main(String[] args) {
        // 문제 1: 짝수만 필터링 [2, 4, 6, 8, 10]
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(evens);

        // 문제 2: 특정 길이 이상인 문자열 필터링   [elephant, butterfly, tiger]
        List<String> words = Arrays.asList("cat", "elephant", "dog", "butterfly", "ant", "tiger");
        List<String> animals = words.stream()
                .filter(animal -> animal.length() > 4)
                .toList();
        System.out.println(animals);

        // 문제 3: 특정 문자로 시작하는 이름 필터링 [Alice, Anna, Andrew]
        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "Andrew", "David");
        List<String> nameA = names.stream()
                .filter(name -> name.startsWith("A"))
                .toList();
        System.out.println(nameA);

        // 문제 4: 음수 제거 [3, 8, 0, 7, 4]
        List<Integer> mixedNumbers = Arrays.asList(-5, 3, -2, 8, -1, 0, 7, -9, 4);
        List<Integer> posNums = mixedNumbers.stream()
                .filter(num -> num >= 0)
                .toList();
        System.out.println(posNums);

        // 문제 5: 가격 범위로 상품 필터링  [키보드, 모니터]
        List<Product> products = Arrays.asList(
                new Product("노트북", 1500000),
                new Product("마우스", 30000),
                new Product("키보드", 80000),
                new Product("모니터", 300000),
                new Product("USB", 15000)
        );
        List<String> pickedProduct = products.stream()
                .filter(product -> product.price >=50000 && product.price <=500000)
                .map(Product::getName)
                .toList();
        System.out.println(pickedProduct);


        // 문제 6: 이메일 도메인으로 필터링  [user1@gmail.com, support@gmail.com, hello@gmail.com]
        List<String> emails = Arrays.asList(
                "user1@gmail.com",
                "admin@company.com",
                "support@gmail.com",
                "info@naver.com",
                "hello@gmail.com",
                "test@daum.net"
        );
        List<String> gmailList = emails.stream()
                .filter(email -> email.contains("gmail"))
                .toList();
        System.out.println(gmailList);

        // 문제 7: 성인만 필터링 [김철수(25), 박민수(30), 최수현(22)]
        List<Person_ad> people = Arrays.asList(
                new Person_ad("김철수", 25),
                new Person_ad("이영희", 17),
                new Person_ad("박민수", 30),
                new Person_ad("정지원", 16),
                new Person_ad("최수현", 22)
        );
        List<String> adultList = people.stream()
                .filter(person -> person.getAge() > 18)
                .map(person -> String.format("%s(%d)", person.getName(), person.getAge()))
                .toList();
        System.out.println(adultList);


        // 문제 8: 합격자 필터링   [김철수, 이영희, 최수현]
        List<Student_f> students = Arrays.asList(
                new Student_f("김철수", 85, 90),
                new Student_f("이영희", 92, 88),
                new Student_f("박민수", 65, 70),
                new Student_f("정지원", 78, 85),
                new Student_f("최수현", 95, 92)
        );
        List<String> highStudent = students.stream()
                .filter(s -> s.getEnglishScore() >= 80 && s.getMathScore() >= 80)
                .map(Student_f::getName)
                .toList();
        System.out.println(highStudent);


        // 문제 9: 특정 키워드 포함 여부로 필터링   [Java 프로그래밍 기초, Java Stream API 완벽 가이드, Java Spring Boot 실전]
        List<String> articles = Arrays.asList(
                "Java 프로그래밍 기초",
                "Python으로 배우는 머신러닝",
                "Java Stream API 완벽 가이드",
                "JavaScript 최신 기능",
                "Java Spring Boot 실전",
                "React 입문 강좌"
        );
        List<String> containJava = articles.stream()
                .filter(article -> article.contains("Java"))
                .toList();
        System.out.println(containJava);

        // 문제 10: 재고가 있고 할인 중인 상품 필터링   [노트북, 헤드셋]
        List<Item> items = Arrays.asList(
                new Item("노트북", 5, true, 1000000),
                new Item("마우스", 0, true, 30000),
                new Item("키보드", 10, false, 50000),
                new Item("헤드셋", 3, true, 80000),
                new Item("웹캠", 0, false, 60000)
        );

        List<Item> pickedItems = items.stream()
                .filter(item -> item.getStock() > 0 && item.isOnSale())
//                .map(Item::getName)
                .toList();
        System.out.println(pickedItems);


        // 보너스 1: null이 아닌 값만 필터링   [apple, banana, cherry]
        List<String> data = Arrays.asList("apple", null, "banana", "", null, "cherry", "");
        List<String> nonNullList = data.stream()
                .filter(fruit -> !(Objects.isNull(fruit) || fruit.isBlank()))
                .toList();
        System.out.println(nonNullList);

        // 보너스 2: 중복되지 않은 숫자 필터링 [1, 4, 6, 7, 8]
        List<Integer> nums = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 7, 5, 8);
//        List<Integer> onlyNums = nums.stream()
//                .filter(num -> Collections.frequency(nums, num) == 1)
//                .toList();
//        System.out.println(onlyNums);

        List<Integer> filteringNumbers =  nums.stream().
                filter(num -> nums.stream().filter(num2 -> num2 == num).count() == 1)
                .toList();

        List<Integer> filteringNumbers2 = new ArrayList<>();
        for (Integer num : nums) {
            int count = 0;
            for (Integer num2 : nums) {
                if (num2 == num) count++;
            }
            if (count == 1) {
                filteringNumbers2.add(num);
            }
        }
        System.out.println(filteringNumbers2);


        // 보너스 3: 주말 날짜만 필터링  [2024-01-06, 2024-01-07, 2024-01-13, 2024-01-14]
        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2024, 1, 1),  // 월요일
                LocalDate.of(2024, 1, 6),  // 토요일
                LocalDate.of(2024, 1, 7),  // 일요일
                LocalDate.of(2024, 1, 10), // 수요일
                LocalDate.of(2024, 1, 13), // 토요일
                LocalDate.of(2024, 1, 14)  // 일요일
        );
        List<LocalDate> satSunList = dates.stream()
                .filter(day -> day.getDayOfWeek().getValue() == 6 || day.getDayOfWeek().getValue() ==7)
                .toList();
        System.out.println(satSunList);

        List<LocalDate> filteringDates = dates.stream()
                .filter(localDate ->
                        localDate.getDayOfWeek().name().equals("SATURDAY")
                                || localDate.getDayOfWeek().name().equals("SUNDAY"))
                .toList();
        System.out.println(filteringDates);
    }
}
