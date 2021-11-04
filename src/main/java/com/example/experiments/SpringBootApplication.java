package com.example.experiments;

import com.example.experiments.model.Account.Account;
import com.example.experiments.model.Account.Admin;
import com.example.experiments.model.Item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {

	public static Logger log = LoggerFactory.getLogger(Admin.class);

	// command to run ./gradlew bootRun
	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringBootApplication.class, args);

		try {
			// default account type is User
			Account defaultAccount = context.getBean(Account.class);
			log.info(String.valueOf(defaultAccount));

			// create and configure beans
			ApplicationContext appContext = new ClassPathXmlApplicationContext("file:src/main/resources/beans/accounts.xml");

			// retrieve configured instance
			Account admin = appContext.getBean("admin", Account.class);
			log.info(String.valueOf(admin));

			// default item category is Decor
			Item defaultItem = context.getBean(Item.class);
			log.info(String.valueOf(defaultItem));

			// create and configure beans
			appContext = new ClassPathXmlApplicationContext("file:src/main/resources/beans/items.xml");

			// retrieve configured instance
			Item consumableItem = appContext.getBean("consumableItem", Item.class);
			log.info(String.valueOf(consumableItem));

			// retrieve configured instance
			Item decorItem = appContext.getBean("decorItem", Item.class);
			log.info(String.valueOf(decorItem));
		} catch(Exception e) {
			log.info("An error occurred in the application: " + e.getMessage());
		}

		log.info("-------------------End of Program-------------------");
	}
}
