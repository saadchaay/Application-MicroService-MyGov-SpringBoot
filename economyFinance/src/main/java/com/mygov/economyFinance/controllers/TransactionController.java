package com.mygov.economyFinance.controllers;

import com.mygov.economyFinance.entities.Transaction;
import com.mygov.economyFinance.metiers.dto.TransactionRequest;
import com.mygov.economyFinance.services.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController @RequestMapping("api/v2/transactions")
public record TransactionController(TransactionService service) {

    @GetMapping
    ResponseEntity all(){
        return ResponseEntity.ok().body(service.getAllTransactions());
    }

    @PostMapping
    ResponseEntity store(@RequestBody TransactionRequest request){
        Transaction trs = new Transaction();
        trs.setIdentify(request.getId());
        trs.setName(request.getName());
        trs.setDate(LocalDateTime.now());
        trs.setMinistry(request.getMinistry() == null ? trs.getMinistry(): request.getMinistry());
        trs.setDescription(request.getDescription());
        service.insertTransaction(trs);
        return ResponseEntity.ok().body("Insert Transaction from Economy successfully. "+ request);
    }

}
