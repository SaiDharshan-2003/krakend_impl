package com.example.emp_app.service;

import com.example.emp_app.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Optional<Employee> getEmployeeById(Long employeeId);

    Employee createEmployee(Employee employee);

    Optional<Employee> updateEmployee(Long employeeId, Employee employeeDetails);

    boolean deleteEmployee(Long employeeId);
}
