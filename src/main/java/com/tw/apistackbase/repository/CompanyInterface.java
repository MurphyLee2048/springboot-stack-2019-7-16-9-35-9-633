package com.tw.apistackbase.repository;


import com.tw.apistackbase.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyInterface extends JpaRepository <Company, Integer>{
}
