package com.mygov.economyFinance.controllers;

import com.mygov.economyFinance.metiers.dto.TransactionRequest;
import com.mygov.economyFinance.services.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("api/v1/transactions")
public record TransactionController(TransactionService service) {

    @GetMapping
    ResponseEntity all(){
        return ResponseEntity.ok().body(service.getAllTransactions());
    }

    @PostMapping
    ResponseEntity store(@RequestBody TransactionRequest request){
        return ResponseEntity.ok().body("Insert Department successfully. "+ request);
    }

}
