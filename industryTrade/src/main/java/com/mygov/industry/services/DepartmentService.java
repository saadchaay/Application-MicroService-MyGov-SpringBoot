package com.mygov.industry.services;

import com.mygov.industry.doa.DepartmentRepository;
import com.mygov.industry.entities.Department;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record DepartmentService(DepartmentRepository repository, MongoTemplate mongoTemplate) {

    public void insertDepartment(Department department){
        Query query = new Query();
        query.addCriteria(Criteria.where("name").is(department.getName()));

        List<Department> departmentList = mongoTemplate.find(query, Department.class);
        if(departmentList.size() > 1){
            throw new IllegalStateException("This name is already taken.");
        }
        if(departmentList.isEmpty()){
            System.out.println("Inserting department ....");
            repository.insert(department);
        }
    }

    public List getAllDepartments(){
        return repository.findAll();
    }
}
