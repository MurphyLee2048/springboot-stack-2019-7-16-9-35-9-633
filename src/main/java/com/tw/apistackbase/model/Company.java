package com.tw.apistackbase.model;

import java.util.List;

public class Company {
    private String companyName;
    private int employeeNumber;
    private List<Employee> employees;

    public Company(String companyName, int employeeNumber, List<Employee> employees) {
        this.companyName = companyName;
        this.employeeNumber = employeeNumber;
        this.employees = employees;
    }

    public Company() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
