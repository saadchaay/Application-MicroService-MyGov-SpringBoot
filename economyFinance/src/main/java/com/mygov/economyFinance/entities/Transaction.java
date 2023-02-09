package com.mygov.economyFinance.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Transaction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "identify", unique = true)
    private String identify;

    @Column(name = "ministry")
    private String ministry="Economy and Finance";

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "date")
    private LocalDateTime date;
}
