package org.sid.customerservice;

import org.sid.customerservice.entities.Customer;
import org.sid.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(CustomerServiceApplication.class, args);

    }
    @Bean
    CommandLineRunner start (CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(new Customer(null,"ilyass","ilyass@gmail.com"));
            customerRepository.save(new Customer(null,"salma","salma@gmail.com"));
            customerRepository.save(new Customer(null,"doha","doha@gmail.com"));
            customerRepository.save(new Customer(null,"maryam","maryam@gmail.com"));

            customerRepository.findAll().forEach(customer -> {
                System.out.println(customer.toString());
            });
        };
    }

}
