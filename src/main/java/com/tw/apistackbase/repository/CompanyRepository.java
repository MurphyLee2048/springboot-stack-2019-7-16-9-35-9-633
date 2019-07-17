package com.tw.apistackbase.repository;

import com.tw.apistackbase.model.Company;
import com.tw.apistackbase.model.Employee;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

@Repository
public class CompanyRepository {
    private static Map<String, Company> map = new HashMap<>();

    static {
        Employee employee1 = new Employee(1, "murphy", 22, "female", 66666);
        Employee employee2 = new Employee(2, "murphy", 22, "female", 66666);
        map.put("1", new Company("1", "OOCL", 20000, new ArrayList<Employee>(Arrays.asList(employee1,employee2)){}));
    }

    public Map<String, Company> getMap() {
        return map;
    }

    public List<Company> findAllCompanies() {
        return map.values().stream().collect(Collectors.toList());
    }

    public Company findCompanyById(String companyId) {
        return map.get(companyId);
    }

    public List<Employee> findAllEmployees(String id) {
        return map.get(id).getEmployees();
    }

    public void addCompany(Company company) {
        String companyId = UUID.randomUUID().toString();
        map.put(companyId, company);
    }

    public void updateCompany(String companyId, String companyName, int employeeNumber, List<Employee> employees) {
        Company company = map.get(companyId);
        company.setCompanyName(companyName);
        company.setEmployeeNumber(employeeNumber);
        company.setEmployees(employees);
    }
}
