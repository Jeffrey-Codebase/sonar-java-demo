package com.rakuten.dsaid.sonar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SonarJavaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SonarJavaDemoApplication.class, args);
		System.out.println(getHelloString());
	}

	public static String getHelloString() {
		return "hello soarn java";
	}

}
