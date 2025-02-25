package com.o;

public class Developer implements Employee {
    private double salary;
    
    public Developer(double salary) {
        this.salary = salary;
    }
    
    @Override
    public void work() {
        System.out.println("Writing and debugging code");
    }
    
    @Override
    public double getSalary() {
        return salary;
    }
}