package com.pyan.eduservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
// 添加mapper扫描
@Configuration
@MapperScan("com.pyan.eduservice.mapper")
public class EduConfig {
}
