package com.mygov.economyFinance.metiers.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class DepartmentRequest {
    private String id;
    private String name;
}
