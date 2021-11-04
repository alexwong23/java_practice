package com.example.experiments;

import com.example.experiments.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;


@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {

	public static Logger log = LoggerFactory.getLogger(Student.class);

	// command to run ./gradlew bootRun
	public static void main(String[] args) {

		log.info("-------------------Start of Program-------------------");

		ConfigurableApplicationContext context = SpringApplication.run(SpringBootApplication.class, args);

		Student james = new Student("James", "Soh", 24);

		log.info(String.valueOf(james));

		log.info("-------------------End of Program-------------------");
	}
}
