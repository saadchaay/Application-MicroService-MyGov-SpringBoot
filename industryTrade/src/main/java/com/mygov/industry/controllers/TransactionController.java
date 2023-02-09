package com.mygov.industry.controllers;

import com.mygov.industry.metieirs.dto.DepartmentRequest;
import com.mygov.industry.services.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("api/v1/transactions")
public record TransactionController(TransactionService service) {

    @GetMapping
    ResponseEntity all(){
        return ResponseEntity.ok().body(service.getAllTransactions());
    }

    @PostMapping
    ResponseEntity store(@RequestBody DepartmentRequest request){
        return ResponseEntity.ok().body("Insert Department successfully. "+ request);
    }
}
