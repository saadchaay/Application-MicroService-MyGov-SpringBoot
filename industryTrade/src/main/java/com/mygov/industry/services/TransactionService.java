package com.mygov.industry.services;

import com.mygov.industry.doa.TransactionRepository;
import com.mygov.industry.entities.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.List;

@Service
public record TransactionService(TransactionRepository repository, RestTemplate restTemplate) {

    public void insertDepartment(Transaction transaction){
        System.out.println("Inserting department ....");
        repository.insert(transaction);
    }

    public List getAllTransactions(){
        return repository.findAll();
    }
}
