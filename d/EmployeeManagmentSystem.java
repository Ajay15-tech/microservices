package com.d;

import s.Employee;
import l.EmployeeService;
import o.Manager;
import o.Developer;
import o.SecurityGuard;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee manager = new Manager(80000);
        Employee developer = new Developer(60000);
        Employee securityGuard = new SecurityGuard(40000);
        
        EmployeeService employeeService = new EmployeeService();
        
        employeeService.displayEmployeeDetails(manager);
        System.out.println();
        employeeService.displayEmployeeDetails(developer);
        System.out.println();
        employeeService.displayEmployeeDetails(securityGuard);
    }
}