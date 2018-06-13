package com.spring.log4j2.async.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo1Application {
	private static final Logger logger = LogManager.getLogger(Demo1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@RequestMapping("/health")
	public String health() {
		logger.trace("Trace Message!");
		logger.debug("Debug Message!");
		logger.info("Info Message!");
		logger.warn("Warn Message!");
		logger.error("Error Message!");
		logger.fatal("Fatal Message!");
		return "Ok";
	}
}
