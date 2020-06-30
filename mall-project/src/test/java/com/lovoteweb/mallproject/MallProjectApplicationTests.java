package com.lovoteweb.mallproject;

import com.lovoteweb.mallproject.dto.UserDetailServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;

@SpringBootTest
class MallProjectApplicationTests {

    @Autowired
    UserDetailServiceImpl userDetailService;
    @Test
    void contextLoads() {
        UserDetails userDetails = userDetailService.loadUserByUsername("123456");
        System.out.println(userDetails);
    }

}
