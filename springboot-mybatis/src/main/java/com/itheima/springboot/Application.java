package com.itheima.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication	//代表springBoot应用的运行主类
public class Application {
	public static void main(String[] args) {
		/** 运行springboot应用  */
		//SpringApplication.run(Application.class, args);
		
		/** 取消横幅 */
		SpringApplication springApplication = new SpringApplication(Application.class);
		//取消横幅
		springApplication.setBannerMode(Banner.Mode.OFF);
		//运行
		springApplication.run(args);
	}
}
