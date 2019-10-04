package com.mybatisTest.demo;

import com.zf.domain.User;
import org.junit.Test;

public class test2 {

    @Test
    public void test1(){
        User user = User.builder()
                .id("")
                .age(1)
                .address("")
                .username("").build();
        System.out.println(user);
    }
}
