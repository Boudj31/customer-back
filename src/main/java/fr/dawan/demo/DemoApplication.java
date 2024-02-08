package fr.dawan.demo;

import fr.dawan.demo.dto.CustomerRegisterDto;
import fr.dawan.demo.service.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(CustomerService customerService) {

        CustomerRegisterDto customer1 = new CustomerRegisterDto("narutoKun", "naruto@test.fr", "secret", "Hokage", "Naruto", "Je vais devenir hokage", "UZUMAKI");
        CustomerRegisterDto customer2 = new CustomerRegisterDto("SasukeKun", "sasuke@test.fr", "secret", "Jonin", "Sasuke", "Je vais devenir hokage", "UCHIWA");
        CustomerRegisterDto customer3 = new CustomerRegisterDto("kakashiKun", "kakashi@test.fr", "secret", "Jonin", "Kakashi", "Je vais devenir hokage", "HATAKE");
        CustomerRegisterDto customer4 = new CustomerRegisterDto("itachiKun", "itachi@test.fr", "secret", "Akatsuki", "Itachi", "Je vais devenir hokage", "UCHIWA");

        return args -> {
            customerService.registerCustomer(customer1);
            customerService.registerCustomer(customer2);
            customerService.registerCustomer(customer3);
            customerService.registerCustomer(customer4);
        };
       }
    }

