package com.cz.mallcopy.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.cz.mallcopy.mbg.mapper")
public class MyBatisConfig {

}
