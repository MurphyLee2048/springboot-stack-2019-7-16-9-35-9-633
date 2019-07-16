package com.tw.apistackbase.service;

import com.tw.apistackbase.model.Company;
import com.tw.apistackbase.model.Employee;
import com.tw.apistackbase.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> findAllCompanies() {
        return companyRepository.findAllCompanies();
    }

    public Company findCompanyById(String id) {return companyRepository.findCompanyById(id);}

    public List<Employee> findAllEmployees(String id) {return companyRepository.findAllEmployees(id);}

    public void addCompany(Company company) {companyRepository.addCompany(company);}

}
