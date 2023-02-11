package org.example.model;

import jakarta.persistence.*;

import java.util.List;
//import org.springframework.data.annotation.Id;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToOne(cascade = CascadeType.MERGE)
    private Doctor doctor;
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                //", doctor=" + doctor +
                '}';
    }

    public Patient() {
    }
    public Patient(String name) {
        this.name = name;

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
