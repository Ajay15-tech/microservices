package com.i;

public class EmployeeImpl implements Workable, Payable {
    private double salary;

    public EmployeeImpl(double salary) {
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println("Performing employee duties");
    }

    @Override
    public double getSalary() {
        return salary;
    }
}