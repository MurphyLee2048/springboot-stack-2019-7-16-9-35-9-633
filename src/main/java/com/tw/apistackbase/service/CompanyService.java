package com.tw.apistackbase.service;

import com.tw.apistackbase.model.Company;
import com.tw.apistackbase.repository.CompanyRepository;

import java.util.List;
import java.util.stream.Collectors;

public class CompanyService {
    CompanyRepository companyRepository = new CompanyRepository();
    public List<Company> findAll() {
        return companyRepository.getMap().values().stream().collect(Collectors.toList());
    }
}
