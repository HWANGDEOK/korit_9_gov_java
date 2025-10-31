package com.korit.study.ch32;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Stream(데이터의 흐름)
 * 입력 스트림(Input Stream): 파일 -> 프로그램
 * 출력 스트림(OutputStream): 프로그램 -> 파일
 * 종류: 바이트 스트림(byte stream), 문자 스트림(text stream)
 * 1. 바이트 스트림(이미지, 음성, 영상 등 ...)
 *  - InputStream / OutputStream
 *  - FileInputStream / FileOutputStream
 *  - BufferedInputStream / BufferOutputStream
 *
 * 2. 문자 스트림(텍스트)
 *  - Reader / Writer
 *  - FileReader / FileWriter
 *  - BufferedReader / BufferedWriter
 */

public class FileMain {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("test.txt");
            fileWriter.write("이름: 황현덕3\n");       // 덮어 쓰기
            fileWriter.write("나이 : 26\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileWriter fileWriter = new FileWriter("test.txt", true);
            fileWriter.write("이름: 황현덕3\n");       // 덮어 쓰기
            fileWriter.write("나이 : 26\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader("test.txt");
            StringBuilder builder = new StringBuilder();
            while (true) {
                int readData = fileReader.read();
                if (readData == -1) {
                    break;
                }
                char text = (char) readData;
                builder.append(text);
            }
            System.out.println(builder.toString());
           List<String> textList = Arrays.asList(builder.toString().split("\n"));
            System.out.println(textList);

        } catch (FileNotFoundException e) {
            System.out.println("해당 파일을 찾을 수 없습니다");
        } catch (IOException e) {
            System.out.println("FileReader 객체를 통해 데이털르 읽는데 실패하였습니다.");
        }

        System.out.println("프로그램 정상 종료");

    }
}
