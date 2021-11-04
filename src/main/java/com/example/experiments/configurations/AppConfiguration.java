package com.example.experiments.configurations;

import com.example.experiments.model.Account.Account;
import com.example.experiments.model.Account.Admin;
import com.example.experiments.model.Account.User;
import com.example.experiments.model.Item.ConsumableItemService;
import com.example.experiments.model.Item.DecorItemService;
import com.example.experiments.model.Item.ItemService;
import com.example.experiments.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class AppConfiguration {

    @Bean
    @ConditionalOnProperty(value = "account.service.mode", havingValue = "admin", matchIfMissing = false)
    public Account admin() {
        return new Admin();
    }

    @Bean
    @ConditionalOnProperty(value = "account.service.mode", havingValue = "user", matchIfMissing = true)
    public Account user() {
        return new User();
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

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return args -> {
            // retrieve configured instance
            User user = new User(
                    "MoSalahhh",
                    "PASSW_RD",
                    "jamessoh@gmail.com",
                    "James",
                    "Soh",
                    LocalDate.of(2000, Month.JANUARY, 5));
            User user2 = new User(
                    "julius922",
                    "gloryOfRome",
                    "juliuscaesar@gmail.com",
                    "Julius",
                    "Caesar",
                    LocalDate.of(1994, Month.SEPTEMBER, 15));
            userRepository.saveAll(List.of(user, user2));
        };
    }
}
