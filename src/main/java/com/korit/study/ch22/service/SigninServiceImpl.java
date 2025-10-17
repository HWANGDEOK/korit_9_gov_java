package com.korit.study.ch22.service;

import com.korit.study.ch22.dto.SigninDto;
import com.korit.study.ch22.dto.SignupDto;
import com.korit.study.ch22.entity.User;
import com.korit.study.ch22.repository.UserRepository;

import java.util.Objects;

import static com.korit.study.ch22.util.PasswordEncoder.encode;

public class SigninServiceImpl implements SigninService{
    // 싱글톤을 만들 것

    private static SigninServiceImpl instance;
    private UserRepository userRepository;

    public SigninServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static SigninServiceImpl getInstance() {
        if(Objects.isNull(instance)){
            instance = new SigninServiceImpl(UserRepository.getInstance());
        }
        return instance;
    }

    public boolean isFindUsername(String username) {
        User foundUser = userRepository.findByUsername(username);
        if(!Objects.isNull(foundUser)) {
            return true;
        }
        return false;
    }





    @Override
    public void signin(SignupDto signupDto) {
        // 로그인을 시도한 사용자이름 확인 userRepository에서
        // 해당 사용자 이름을 가진 User 객체가 있는 지 확인
        // 객체가 null이면 함수 탈출(사용자 정보를 다시 확인하세요.)

        // 비밀번호 일치 확인
        // 비밀번호가 일치하지 않으면 함수 탈출(사용자 정보를 다시 확인하세요.)

        // 로그인 성공 -> 로그인 성공한 User 객체 toString으로 출력

    }

    @Override
    public boolean isEmpty(String str) {
        // username, password가 각각 공백이 아닌지 확인용도
        return false;
    }
}
