package com.rest.testTechnique.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.testTechnique.modele.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
