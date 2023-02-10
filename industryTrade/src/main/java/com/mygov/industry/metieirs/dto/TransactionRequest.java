package com.mygov.industry.metieirs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data @AllArgsConstructor @NoArgsConstructor
public class TransactionRequest {
    private String identify;
    private String ministry;
    private String name;
    private String description;
    private Double amount;
    private LocalDateTime date;
}
