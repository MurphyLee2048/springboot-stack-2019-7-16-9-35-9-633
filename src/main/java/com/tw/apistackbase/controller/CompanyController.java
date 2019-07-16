package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Company;
import com.tw.apistackbase.service.CompanyService;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class CompanyController {
    CompanyService companyService = new CompanyService();

    @GetMapping("/companies")
    public List<Company> list() {
        return companyService.findAll();
    }
}
