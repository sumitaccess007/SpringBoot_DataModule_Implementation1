package com.sumitaccess007.entities;

import javax.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @Column(name="E_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="E_Name")
    private String name;

    @Column(name="E_Salary")
    private Double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
