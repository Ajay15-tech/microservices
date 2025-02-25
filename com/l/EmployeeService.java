package com.l;

public class EmployeeService {
    public void displayEmployeeDetails(Employee employee) {
        System.out.println("Role: " + employee.getClass().getSimpleName());
        employee.work();
        System.out.println("Salary: $" + employee.getSalary());
    }
}
