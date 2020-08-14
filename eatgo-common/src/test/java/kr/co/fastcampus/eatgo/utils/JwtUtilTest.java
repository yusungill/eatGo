package kr.co.fastcampus.eatgo.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class JwtUtilTest {

    @Test
    public void createToken(){

        JwtUtil jwtUtil = new JwtUtil();

        String token = jwtUtil.createToken(1004L,"John");

        assertThat(token).contains(".");
    }
}