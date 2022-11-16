package com.rest.testTechnique.service;
import org.springframework.stereotype.Service;

import com.rest.testTechnique.modele.Employee;
import com.rest.testTechnique.repository.EmployeeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeService {
    private final EmployeeRepository EmployeeRepo;
    public Employee creer(Employee e) {
		
		return EmployeeRepo.save(e);
	}
}
