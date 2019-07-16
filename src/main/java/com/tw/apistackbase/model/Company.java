package com.tw.apistackbase.model;

public class Company {
    private String companyName;
    private int employeeNumber;
    private Employee employee;

    public Company(String companyName, int employeeNumber, Employee employee) {
        this.companyName = companyName;
        this.employeeNumber = employeeNumber;
        this.employee = employee;
    }

    public Company() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
