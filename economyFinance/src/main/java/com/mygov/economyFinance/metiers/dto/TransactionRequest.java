package com.mygov.economyFinance.metiers.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data @AllArgsConstructor @NoArgsConstructor
public class TransactionRequest {

    private Long id;
    private String identify;
    private String ministry;
    private String name;
    private String description;
    private LocalDateTime date;

}
