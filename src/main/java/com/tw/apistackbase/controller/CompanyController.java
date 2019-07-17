package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Company;
import com.tw.apistackbase.repository.CompanyInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompanyController {
    @Autowired
    private CompanyInterface companyInterface;

    @PostMapping("/companies")
    public void createCompany(@RequestBody Company company) {
       companyInterface.save(company);
    }

    @GetMapping("/companies")
    public void findAllCompany() {
        companyInterface.findAll();
    }

    @DeleteMapping("/companies/{id}")
    public void deleteCompanyById(@PathVariable int id) {
        companyInterface.deleteById(id);
    }

    @PutMapping("/companies/{id}")
    public void deleteCompanyById(@PathVariable String id, Company company) {
        companyInterface.saveAndFlush(company);
    }
}
