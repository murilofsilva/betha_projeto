package com.betha.projeto_tecnico3;

import com.betha.projeto_tecnico3.model.Employee;
import com.betha.projeto_tecnico3.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {
    private final EmployeeService employeeService;

    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getEmployeeById (@PathVariable("id") Long id)
    {
        System.out.printf ("AAAAAAA");
        Employee employee = employeeService.findEmployeeById((id));
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping("/registro")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee)
    {
        System.out.println ("AAAAAAA2222222");
        Employee newEmployee = employeeService.addEmployee(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }

}
