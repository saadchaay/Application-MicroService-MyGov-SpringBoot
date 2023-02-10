package com.mygov.industry.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document @Data @NoArgsConstructor
public class Transaction {
    @Id
    private String id;
    private String ministry="Industry";
    private String name;
    private String description;
    private Double amount;
    private LocalDateTime date;

    public Transaction(String name, String description, Double amount, LocalDateTime date) {
        this.name = name;
        this.amount = amount;
        this.description = description;
        this.date = date;
    }
}
