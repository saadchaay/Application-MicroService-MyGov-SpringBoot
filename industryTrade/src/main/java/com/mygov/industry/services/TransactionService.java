package com.mygov.industry.services;

import com.mygov.industry.doa.TransactionRepository;
import com.mygov.industry.entities.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record TransactionService(TransactionRepository repository) {

    public void insertDepartment(Transaction transaction){
        System.out.println("Inserting department ....");
        repository.insert(transaction);
    }

    public List getAllTransactions(){
        return repository.findAll();
    }
}
