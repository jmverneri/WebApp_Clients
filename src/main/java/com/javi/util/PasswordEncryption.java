package com.javi.util;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncryption {
    public static void main(String[] args) {
        var password = "123";
        System.out.println("Pass: " + password);
        System.out.println("Pass encrypted: " + encryptPassword(password));
    }
    public static String encryptPassword(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        return encoder.encode(password);
    }
}
