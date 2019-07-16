package com.tw.apistackbase.repository;

import com.tw.apistackbase.model.Company;
import com.tw.apistackbase.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class CompanyRepository {
    private static Map<String, Company> map = new HashMap<>();

    static {
        map.put("1", new Company("OOCL", 20000, new Employee(1, "murphy", 22, "female", 66666)));
    }

    public Map<String, Company> getMap() {
        return map;
    }

    public List<Company> findAll() {
        return map.values().stream().collect(Collectors.toList());
    }
}
