package com.mygov.economyFinance.controllers;

import com.mygov.economyFinance.metiers.dto.DepartmentRequest;
import com.mygov.economyFinance.services.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("api/v1/departments")
public record DepartmentController(DepartmentService departmentService) {

    @GetMapping
    ResponseEntity all(){
        return ResponseEntity.ok().body(departmentService.getAllDepartments());
    }

    @PostMapping
    ResponseEntity store(@RequestBody DepartmentRequest request){
        return ResponseEntity.ok().body("Insert Department successfully. "+ request);
    }
}
