package com.learningSpring.springFirst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFirstApplication {
	public static final Logger logger=LoggerFactory.getLogger(SpringFirstApplication.class);
//after adding this
	public static void main(String[] args) {
		SpringApplication.run(SpringFirstApplication.class, args);
		logger.info("Application Started");
	}

}
