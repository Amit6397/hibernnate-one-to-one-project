package com.sunglowsys.domain;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToOne
    private AddressCrud address;

    public Student() {
    }

    public Student(String name, AddressCrud address) {
        this.name = name;
        this.address = address;
    }

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



    public AddressCrud getAddress() {
        return address;
    }

    public void setAddress(AddressCrud address) {
        this.address = address;
    }
}
