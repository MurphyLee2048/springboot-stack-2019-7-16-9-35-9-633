package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Company;
import com.tw.apistackbase.model.Employee;
import com.tw.apistackbase.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CompanyController {
    @Autowired
    CompanyService companyService;

    @GetMapping("/companies")
    public List<Company> findAllCompanies() {
        return companyService.findAllCompanies();
    }

    @GetMapping("/companies/{companyId}")
    public Company findCompanyById(@PathVariable String companyId) {
        return companyService.findCompanyById(companyId);
    }

    @GetMapping("/companies/{id}/employees")
    public List<Employee> findAllEmployees(@PathVariable String id) {
        return companyService.findAllEmployees(id);
    }

    @PostMapping("/companies")
    public void addCompany(@RequestBody Company company) {
        companyService.addCompany(company);
    }

    @PutMapping("/company/{companyId}")
    public void updateCompany(@PathVariable String companyId, @RequestBody String companyName, @RequestBody int employeeNumber, @RequestBody List<Employee> employees) {companyService.updateCompany(companyId, companyName, employeeNumber, employees);}


}
