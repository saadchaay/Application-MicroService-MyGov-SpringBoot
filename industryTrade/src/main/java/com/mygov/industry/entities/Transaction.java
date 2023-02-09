package com.mygov.industry.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document @Data
public class Transaction {
    @Id
    private String id;
    private String ministry="Industry";
    private String name;
    private String description;
    private LocalDateTime date;
}
