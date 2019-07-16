package com.tw.apistackbase.repository;

import com.tw.apistackbase.model.Company;
import com.tw.apistackbase.model.Employee;

import java.util.HashMap;
import java.util.Map;

public class CompanyRepository {
    private static Map<String, Company> map = new HashMap<>();

    public static Map<String, Company> getMap() {
        return map;
    }
}
