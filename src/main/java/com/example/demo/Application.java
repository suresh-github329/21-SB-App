package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    static boolean flag = true;
    public static final int i = 20;
  
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	public void m1()
	{
		System.out.println("hello");
	}

}
