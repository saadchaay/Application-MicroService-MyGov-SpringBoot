package com.mygov.economyFinance.services;

import com.mygov.economyFinance.doa.TransactionRepository;
import com.mygov.economyFinance.entities.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public record TransactionService(TransactionRepository repository, RestTemplate restTemplate) {

    public void insertTransaction(Transaction transaction){
        System.out.println("Inserting department ....");
        repository.save(transaction);
    }

    public List getAllTransactions(){
        List<Transaction> transactions = repository.findAll();
        transactions.addAll(restTemplate.getForObject("http://INDUSTRY/api/v1/transactions", List.class));
        return transactions;
    }
}
