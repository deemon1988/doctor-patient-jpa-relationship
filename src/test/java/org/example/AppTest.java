package org.example;

import static org.junit.Assert.assertTrue;

import org.example.model.Doctor;
import org.example.model.Patient;
import org.example.repository.DoctorRepository;
import org.junit.Test;

import javax.print.Doc;

public class AppTest 
{

    @Test
    public void shouldPersistDoctorAndPatients()
    {
        Doctor doctor = new Doctor();
        doctor.setName("test_doctor");
        Patient patient = new Patient();
        patient.setName("patient");
        patient.setDoctor(doctor);

    }
}
