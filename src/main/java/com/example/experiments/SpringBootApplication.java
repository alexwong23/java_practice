package com.example.experiments;

import com.example.experiments.service.Account.AccountService;
import com.example.experiments.service.Item.ItemService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {

	// command to run ./gradlew bootRun
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootApplication.class, args);

		// default account type is User
		AccountService defaultAccount = context.getBean(AccountService.class);
		defaultAccount.say();

		// create and configure beans
		ApplicationContext appContext = new ClassPathXmlApplicationContext("file:src/main/resources/beans/accounts.xml");

		// retrieve configured instance
		AccountService admin = appContext.getBean("admin", AccountService.class);
		admin.say();

		// retrieve configured instance
		AccountService user = appContext.getBean("user", AccountService.class);
		user.say();

		// default item category is Decor
		ItemService defaultItem = context.getBean(ItemService.class);
		defaultItem.say();

		// create and configure beans
		appContext = new ClassPathXmlApplicationContext("file:src/main/resources/beans/items.xml");

		// retrieve configured instance
		ItemService consumableItem = appContext.getBean("consumableItem", ItemService.class);
		consumableItem.say();

		// retrieve configured instance
		ItemService decorItem = appContext.getBean("decorItem", ItemService.class);
		decorItem.say();
	}

}
