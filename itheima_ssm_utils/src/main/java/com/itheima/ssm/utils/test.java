package com.itheima.ssm.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class test {
    public static void main(String[] args) {
        String password="123";
        String encodePassword = getPasswordEncoder(password);
        System.out.println(encodePassword);

    }
    private static BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
    public static String getPasswordEncoder(String password){
        String endPassword = bCryptPasswordEncoder.encode(password);
        return  endPassword;

    }
}
