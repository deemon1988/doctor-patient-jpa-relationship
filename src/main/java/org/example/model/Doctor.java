package org.example.model;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Doctor {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private String speciality;
  /*  @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Patient> patient;*/
    public Doctor() {
    }

@OneToOne(cascade = CascadeType.ALL)
    private Patient patient;
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

  /*  public List<Patient> getPatient() {
        return patient;
    }

    public void setPatient(List<Patient> patienList) {
        this.patient = patienList;
    }
*/


    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speciality='" + speciality + '\'' +
               // ", patient=" + patient +
                '}';
    }
}
