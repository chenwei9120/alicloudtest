package com.bit.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author chenwei
 * @version 1.0.0
 * @ClassName Encrypt.java
 * @Description TODO
 * @createTime 2020年04月30日 23:18:00
 */
public class Encrypt {
    public static void main(String[] args) {
        int i = 0;
        BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();
        while(i < 10) {
            String s = bcryptPasswordEncoder.encode("nacos".trim());
            System.out.println(s);
            ++i;
        }
    }
}