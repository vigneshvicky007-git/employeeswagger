package com.emploee.swagger.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "employee_Details")
public class Employee {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "employeeNo")
    private int rollNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
