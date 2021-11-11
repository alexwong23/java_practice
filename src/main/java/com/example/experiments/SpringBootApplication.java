package com.example.experiments;

import com.example.experiments.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {

	public static Logger log = LoggerFactory.getLogger(Employee.class);

	// command to run ./gradlew bootRun
	public static void main(String[] args) {

		log.info("-------------------Start of Program-------------------");

		ConfigurableApplicationContext context = SpringApplication.run(SpringBootApplication.class, args);

		Employee james = new Employee("James", "Soh", 24, 10000.99);

		log.info(String.valueOf(james));

		log.info("-------------------End of Program-------------------");
	}
}
