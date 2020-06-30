package com.lovoteweb.mallproject.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.lovoteweb.mallproject.mbg.mapper")
public class MyBatisCongfig {
}
