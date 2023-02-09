package com.mygov.industry;

import com.mygov.industry.doa.DepartmentRepository;
import com.mygov.industry.entities.Department;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@EnableEurekaClient
public class IndustryTradeApp {
    public static void main(String[] args) {
        SpringApplication.run(IndustryTradeApp.class, args);
    }

    @Bean
    CommandLineRunner runner(DepartmentRepository repository){
        return args -> {
            repository.insert(List.of(new Department("RH"), new Department("comptabilité")));
        };
    }
}
