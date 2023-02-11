package org.example.model;

import jakarta.persistence.*;
//import org.springframework.data.annotation.Id;

@Entity
public class Patient {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToOne(mappedBy = "patient")
    private Doctor doctor;

    public Patient() {
    }
    public Patient(String name) {
        this.name = name;

    }
    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", doctor=" + doctor +
                '}';
    }
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
