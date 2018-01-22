package com.example.demo

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class DemoApplication {

	static Logger logger = LoggerFactory.getLogger(DemoApplication)

	static void main(String[] args) {
		logger.info('Running DemoApplications, tabbles ')
		SpringApplication.run DemoApplication, args
	}
}
