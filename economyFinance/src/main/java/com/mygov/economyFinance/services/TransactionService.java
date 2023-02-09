package com.mygov.economyFinance.services;

import com.mygov.economyFinance.doa.TransactionRepository;
import com.mygov.economyFinance.entities.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record TransactionService(TransactionRepository repository) {

    public void insertDepartment(Transaction transaction){
        System.out.println("Inserting department ....");
        repository.save(transaction);
    }

    public List getAllTransactions(){
        return repository.findAll();
    }
}
