package com.mygov.industry.controllers;

import com.mygov.industry.entities.Transaction;
import com.mygov.industry.metieirs.dto.DepartmentRequest;
import com.mygov.industry.metieirs.dto.TransactionRequest;
import com.mygov.industry.services.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.List;

@RestController @RequestMapping("api/v1/transactions")
public record TransactionController(TransactionService service, RestTemplate restTemplate) {

    @GetMapping
    ResponseEntity<List> all(){
        return ResponseEntity.ok().body(service.getAllTransactions());
    }

    @PostMapping
    ResponseEntity<String> store(@RequestBody TransactionRequest request){
        Transaction trs = new Transaction();
        trs.setName(request.getName());
        trs.setDescription(request.getDescription());
        trs.setAmount(request.getAmount());
        trs.setDate(LocalDateTime.now());
        service.insertDepartment(trs);
        return ResponseEntity.ok().body(restTemplate.postForObject("http://ECONOMY/api/v2/transactions", trs, String.class));
    }
}
