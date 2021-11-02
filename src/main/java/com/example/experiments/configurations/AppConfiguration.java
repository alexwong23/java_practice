package com.example.experiments.configurations;

import com.example.experiments.service.Account.AccountService;
import com.example.experiments.service.Account.AdminService;
import com.example.experiments.service.Account.UserService;
import com.example.experiments.service.Item.ConsumableItemService;
import com.example.experiments.service.Item.DecorItemService;
import com.example.experiments.service.Item.ItemService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    @ConditionalOnProperty(value = "account.service.mode", havingValue = "admin", matchIfMissing = false)
    public AccountService adminService() {
        return new AdminService();
    }

    @Bean
    @ConditionalOnProperty(value = "account.service.mode", havingValue = "user", matchIfMissing = true)
    public AccountService userService() {
        return new UserService();
    }

    @Bean
    @ConditionalOnProperty(value = "item.service.mode", havingValue = "consumable", matchIfMissing = false)
    public ItemService consumableItemService() {
        return new ConsumableItemService();
    }

    @Bean
    @ConditionalOnProperty(value = "item.service.mode", havingValue = "decor", matchIfMissing = true) // returned if nothing found
    public ItemService decorItemService() {
        return new DecorItemService();
    }
}
