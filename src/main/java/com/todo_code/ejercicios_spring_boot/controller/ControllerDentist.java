package com.todo_code.ejercicios_spring_boot.controller;

import com.todo_code.ejercicios_spring_boot.models.Patient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import static com.todo_code.ejercicios_spring_boot.models.Patient.getPatients;

@RestController
public class ControllerDentist {


    @GetMapping("/getPatients")
    @ResponseBody
    public List<Patient> getAllPatients(){
        return getPatients();
    }

    @GetMapping("/getPatients/minors")
    @ResponseBody
    public List<Patient> getMinorsPatients(){
        List<Patient> allPatients = getPatients();
        List<Patient> minorsPatient = new ArrayList<Patient>();
        for (Patient patient: allPatients){
            int age = Period.between(patient.getBirthDate(), LocalDate.now()).getYears();
            if (age < 18) minorsPatient.add(patient);
        }
        return minorsPatient;
    }
}
