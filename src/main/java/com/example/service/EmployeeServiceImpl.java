package com.example.service;


import com.example.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmployeeServiceImpl implements EmployeeService{
    private List<Employee> employees = new ArrayList<>();

    @Override
    public List<Employee> getAllEmployees(){
        return employees;
    }

    @Override
    public void addEmployee(Employee employee) {
        Employee existingEmployee = getEmployeeById(employee.getID());
        if (existingEmployee != null){
            existingEmployee.setName(employee.getName());
            existingEmployee.setAge(employee.getAge());
            existingEmployee.setJobPosition(employee.getJobPosition());
            existingEmployee.setDepartment(employee.getDepartment());
            existingEmployee.setSalary(employee.getSalary());
        }
    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployee(String id) {
        Employee employee= getEmployeeById(id);
        if (employee !=null){
            employees.remove(employee);
        }
    }

    @Override
    public Employee getEmployeeById(String id) {
        return employees.stream().filter(e ->e.getID().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Employee> searchEmployees(String query) {
        List<Employee> result=new ArrayList<>();
        for ( Employee employee: employees){
            if (employee.getName().contains(query)|| employee.getID().contains(query));{
                result.add(employee);
            }
        }
        return result;
    }
}
