package com.korit.study.ch22;


import com.korit.study.ch22.dto.SigninDto;
import com.korit.study.ch22.dto.SignupDto;
import com.korit.study.ch22.repository.UserRepository;
import com.korit.study.ch22.service.SigninServiceImpl;
import com.korit.study.ch22.service.SignupService;

import java.util.Scanner;

public class SignupMain {
    public static void main(String[] args) {
        SignupService signupService = SignupService.getInstance();
        SigninServiceImpl signinService = SigninServiceImpl.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("[회원가입, 로그인]");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 가입된 회원 전체 조회");
            System.out.println("q. 종료");
            System.out.println("선택 >> ");
            String selectedMenu = scanner.nextLine();

            if ("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("프로그램 종류 중...");
                break;
            } else if ("1".equals(selectedMenu)) {
                System.out.println("[ 회원가입 ]");
                SignupDto signupDto = new SignupDto();
                System.out.print("사용자 이름: ");
                while (true) {
                    signupDto.setUsername(scanner.nextLine());
                    if(signupService.isValidDuplicatedUsername(signupDto.getUsername())){
                        break;
                    }
                    System.out.println("이미 사용중인 사용자 이름입니다");
                }
                while (true) {
                    System.out.print("비밀번호: ");
                    signupDto.setPassword(scanner.nextLine());
                    if (signupService.isValidPassword(signupDto.getPassword())){
                        break;
                    }
                    System.out.println("비밀번호는 공백일 수 없습니다. 다시 입력하세요.");
                }
                while (true) {
                    System.out.print("비밀번호 확인: ");
                    signupDto.setConfirmPassword(scanner.nextLine());
                    if (signupService.isValidConfirmPassword(signupDto.getPassword(), signupDto.getConfirmPassword())) {
                        break;
                    }
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요.");
                }

                signupService.signup(signupDto);
                System.out.println("<< 회원가입 완료 >>");

            } else if ("2".equals(selectedMenu)) {
                System.out.println("[ 로그인 ]");
                SigninDto signinDto = new SigninDto();
                System.out.print("사용자 이름: ");
                while (true) {
                    signinDto.setUsername(scanner.nextLine());
                    if(signinService.isFindUsername(signinDto.getUsername())){
                        System.out.println("이미 사용중인 사용자 이름입니다");
                        break;
                    }
                    if (signupService.)
                }
                System.out.print("비밀번호: ");

//                signinService.isFindUsername(signinDto.getUsername());





                // SigninDto를 생성하여 로그인 정보 입력 받음(공백확인)
                // 유효성 검사 완료 후 sigin() 호출


            } else if ("3".equals(selectedMenu)) {
                System.out.println("[ 가입된 회원 전체 조회 ]");
                System.out.println(UserRepository.getInstance().toString());
            }
        }

        System.out.println("프로그램 종료 완료");
    }
}
