package com.tw.apistackbase.model;

import javax.persistence.*;
import java.util.List;

@Entity  // 标注一个实体类
@Table(name="company")
public class Company {

    @Id  // 主键
    @GeneratedValue  // 自增
    private int id;
    private String name;
    private String address;

    @OneToMany  // 标注一对多关系
    @JoinColumn(name = "company_id")  // 不要中间表
    private List<Employee> employee;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
