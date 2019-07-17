package com.tw.apistackbase.model;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @ManyToOne
    private Company company;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
