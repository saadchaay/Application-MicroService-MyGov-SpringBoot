package com.mygov.economyFinance.services;

import com.mygov.economyFinance.doa.DepartmentRepository;
import com.mygov.economyFinance.entities.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record DepartmentService(DepartmentRepository repository) {

    public void insertDepartment(Department department){

    }

    public List getAllDepartments(){
        return repository.findAll();
    }
}
