package com.mygov.industry.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document @Data
public class Department {
    @Id
    private String id;
    private String name;

    public Department(String name) {
        this.name = name;
    }
}
