package com.yc.xm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//MyBatis 接口组件扫描
@MapperScan("com.yc.xm")
public class XmAppcation {
	public static void main(String[] args) {
		SpringApplication.run(XmAppcation.class, args);
	}
}

