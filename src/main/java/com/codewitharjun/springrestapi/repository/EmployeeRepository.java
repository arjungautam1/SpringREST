package com.codewitharjun.springrestapi.repository;

import com.codewitharjun.springrestapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
