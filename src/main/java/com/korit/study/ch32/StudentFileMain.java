package com.korit.study.ch32;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class StudentFileMain {
    public static void main(String[] args) {
        try {
            final String FILE_NAME = "student.txt";
            FileReader fileReader = new FileReader(FILE_NAME);
            StringBuilder builder = new StringBuilder();
            while (true) {
                int readData = fileReader.read();
                if (readData == -1) {
                    break;
                }
                char text = (char) readData;
                builder.append(text);
            }
            fileReader.close();

            FileWriter fileWriter = new FileWriter(FILE_NAME);

            Map<String, String> modifyDataMap = Map.of(
                    "이름", "김현덕",
                    "나이", "27",
                    "학교", "연세대학교"
            );

            List<String> readLineList = new ArrayList<>();
            readLineList.addAll(Arrays.asList(builder.toString().split("\\r?\\n")));
            System.out.println(readLineList);


            readLineList.stream().map(line -> {
                AtomicReference<String> stringAtomicReference = new AtomicReference<>(line);
                modifyDataMap.entrySet().forEach(entry -> {
                    if (stringAtomicReference.get().contains(entry.getKey())) {
                        stringAtomicReference.set(String.format("%s: %s", entry.getKey(), entry.getValue()));
                    }
                });
                return stringAtomicReference.get();
            })
                    .toList()
                    .forEach(line -> {
                        try {
                            fileWriter.write(line + "\n");
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
            fileWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println("해당 파일을 찾을 수 없습니다");
        } catch (IOException e) {
            System.out.println("FileReader 객체를 통해 데이털르 읽는데 실패하였습니다.");
        }
    }
}
