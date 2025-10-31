package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;
    // constructor, getters

    public Person(String name, int age) {
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
class Employee {
    private String name;
    private double salary;
    // constructor, getters

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

class EmployeeDTO {
    private String displayName;
    private String salaryInfo;
    // constructor, getters

    public EmployeeDTO(String displayName, String salaryInfo) {
        this.displayName = displayName;
        this.salaryInfo = salaryInfo;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getSalaryInfo() {
        return salaryInfo;
    }

    @Override
    public String toString() {
        return String.format("EmployeeDTO(Mr./Ms. %s, Salary: $%s", displayName, salaryInfo);
    }
}

class Student {
    String name;
    int score;
    // constructor, getters

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

public class StreamPractice {
    public static void main(String[] args) {
        // 대문자 변환 [ALICE, BOB, CHARLIE, DAVID]
        List<String> names = Arrays.asList("alice", "bob", "charlie", "david");
        names = names.stream().
                map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(names);

        // 숫자 제곱 계산  [1, 4, 9, 16, 25]
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers = numbers.stream()
                .map(num -> (int) Math.pow(num, 2))
                .collect(Collectors.toList());
        System.out.println(numbers);

        // 문자열 길이 추출  [4, 6, 3, 11]
        List<String> words = Arrays.asList("Java", "Stream", "API", "Programming");
        List<Integer> lenList = words.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
        System.out.println(lenList);

        // 가격에 세금 추가 [110.0, 220.0, 165.0, 330.0]
        List<Double> prices = Arrays.asList(100.0, 200.0, 150.0, 300.0);
        List<Double> taxPlus = prices.stream()
                .map(p -> p + p / 10)
                .collect(Collectors.toList());
        System.out.println(taxPlus);

        // 객체에서 특정 필드 추출 [Alice, Bob, Charlie]
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );
        List<String> personNames = people.stream()
                .map(person -> person.getName())
                .collect(Collectors.toList());
        System.out.println(personNames);

        // 문자열 포맷팅 [User: john, User: mary, User: steve]
        List<String> usernames = Arrays.asList("john", "mary", "steve");
        List<String> formatList = usernames.stream()
                .map(username -> String.format("User: %s", username))
                .collect(Collectors.toList());
        System.out.println(formatList);

        // 여러 필드를 조합한 새 객체 생성 [EmployeeDTO(Mr./Ms. Kim, Salary: $50000.0), ...]
        List<Employee> employees = Arrays.asList(
                new Employee("Kim", 50000),
                new Employee("Lee", 60000)

        );
        List<EmployeeDTO> employeeInfo =  employees.stream()
                .map(e -> new EmployeeDTO(e.getName(), ((Double) e.getSalary()).toString()))
                .collect(Collectors.toList());
        System.out.println(employeeInfo);


        // 이메일 도메인 추출
        List<String> emails = Arrays.asList(
                "user1@gmail.com",
                "admin@company.co.kr",
                "support@naver.com",
                "info@daum.net"
        );
        List<String> domains = emails.stream()
                .map(email -> email.substring(email.indexOf("@") + 1))
                .collect(Collectors.toList());
        System.out.println(domains);




        // 학생 성적 등급 변환 [김철수: A, 이영희: B, 박민수: C, 정지원: D]
        List<Student> students = Arrays.asList(
                new Student("김철수", 95),
                new Student("이영희", 82),
                new Student("박민수", 76),
                new Student("정지원", 68)
        );
        List<String> studentList = students.stream().map(s -> {
            int score = s.getScore();
            String grade = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : "D";
            return String.format("%s: %s", s.getName(), grade);
        })
        .collect(Collectors.toList());
        System.out.println(studentList);


        // 파일 경로에서 파일명 추출  [report.pdf, system.log, image.jpg, music.mp3]
        List<String> filePaths = Arrays.asList(
                "/home/user/documents/report.pdf",
                "/var/log/system.log",
                "C:\\Users\\Admin\\Desktop\\image.jpg",
                "/downloads/music.mp3"
        );
        List<String> fileNameList = filePaths.stream().map(p -> {
            String fileName = "";
            for (char c : p.toCharArray()) {
                if (c == '/' || c == '\\') {
                    fileName = "";
                }
                else {
                    fileName += c;
                }
            }
            return fileName;
        }).collect(Collectors.toList());
        System.out.println(fileNameList);

        List<String> fileNames = filePaths.stream()
                .map(filePath -> {
                    String replaceStr = filePath.replaceAll("\\\\", "/");
                    return replaceStr.substring(replaceStr.lastIndexOf("/") + 1);
                })
                .collect(Collectors.toList());


        // 전화번호 포맷팅 [010-1234-5678, 010-9876-5432, 010-5555-6666, 010-1111-2222]
        List<String> phoneNumbers = Arrays.asList(
                "01012345678",
                "01098765432",
                "01055556666",
                "01011112222"
        );
        List<String> phonNumList = phoneNumbers.stream().map(n -> n.substring(0,3) + "-" + n.substring(3,7) + "-" + n.substring(7,11)).collect(Collectors.toList());
        System.out.println(phonNumList);
    }
}

