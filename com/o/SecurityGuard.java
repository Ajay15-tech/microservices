package com.o;

public class SecurityGuard implements Employee {
    private double salary;
    
    public SecurityGuard(double salary) {
        this.salary = salary;
    }
    
    @Override
    public void work() {
        System.out.println("Ensuring security and safety");
    }
    
    @Override
    public double getSalary() {
        return salary;
    }
}