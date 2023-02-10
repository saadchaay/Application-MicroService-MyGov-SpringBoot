package com.mygov.industry;

import com.mygov.industry.doa.DepartmentRepository;
import com.mygov.industry.doa.TransactionRepository;
import com.mygov.industry.entities.Department;
import com.mygov.industry.entities.Transaction;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
@EnableEurekaClient
public class IndustryApp {

    public static void main(String[] args) {
        SpringApplication.run(IndustryApp.class, args);
    }

//    @Bean
    CommandLineRunner runner(TransactionRepository repository){
        return args -> {
            Transaction transaction = new Transaction(
                    "test transaction",
                    "description transaction 1",
                    2000.10,
                    LocalDateTime.now()
            );
            repository.insert(transaction);
        };
    }
}
