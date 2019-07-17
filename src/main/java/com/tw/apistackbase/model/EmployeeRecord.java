package com.tw.apistackbase.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_record")
public class EmployeeRecord {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String detail;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDetail() {
        return detail;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
