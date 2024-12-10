package com.example.service;

import com.example.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee>getAllEmployees();
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(String id);
    Employee getEmployeeById(String id);
    List<Employee> searchEmployees(String query);
}
