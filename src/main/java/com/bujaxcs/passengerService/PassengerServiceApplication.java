package com.bujaxcs.passengerService;

import com.bujaxcs.passengerService.repository.delayedPassenger.PassengerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.bujaxcs.*")
public class PassengerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PassengerServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner onStart(PassengerRepository stateczek) {
        return args -> {
            // System.out.println(stateczek.findAll());

        };
    }
}
