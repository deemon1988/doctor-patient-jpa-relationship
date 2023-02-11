package org.example;

import org.example.config.SpringConfig;
import org.example.model.Doctor;
import org.example.model.Patient;
import org.example.repository.DoctorRepository;
import org.example.repository.PatientRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        DoctorRepository repoDoctor = context.getBean(DoctorRepository.class);
        PatientRepository repoPatient = context.getBean(PatientRepository.class);

        Doctor sanders = new Doctor ("Dr. Sanders", "General");
        repoDoctor.save(sanders);

        Patient one =new Patient("Первый");
        Patient two =new Patient("Второй");

        //sanders.setPatients(Arrays.asList(one,two));
        sanders.addPatient(one);
        sanders.addPatient(two);

//        one.setDoctor(sanders);
       repoPatient.save(one);
//
//        two.setDoctor(sanders);
       repoPatient.save(two);





        System.out.println("Пациенты:");
        repoPatient.findAll().forEach(System.out::println);

        System.out.println("Доктора:");
        repoDoctor.findAll().forEach(System.out::println);



    }
}
