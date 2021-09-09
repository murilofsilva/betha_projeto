package com.betha.projeto_tecnico3.service;

import com.betha.projeto_tecnico3.exception.UserNotFoundException;
import com.betha.projeto_tecnico3.model.Employee;
import com.betha.projeto_tecnico3.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.UUID;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee)
    {
        return employeeRepo.save(employee);
    }

    public Employee findEmployeeById(Long id)
    {
        return employeeRepo.findEmployeeById(id).orElseThrow(()-> new UserNotFoundException("Usuario" +
                "de id = " + id + " nao foi encontrado"));
    }
}
