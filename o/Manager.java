package com.o;

public class Manager implements Employee {
    private double salary;
    
    public Manager(double salary) {
        this.salary = salary;
    }
    
    @Override
    public void work() {
        System.out.println("Managing team and projects");
    }
    
    @Override
    public double getSalary() {
        return salary;
    }
}