package com.korit.study.ch22.service;

import com.korit.study.ch22.dto.SigninDto;
import com.korit.study.ch22.dto.SignupDto;

public interface SigninService {
    void signin(SigninDto signinDto);
    boolean isEmpty(String str);    // 공백을 포함하면 안됨
}
