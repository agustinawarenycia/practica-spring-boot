package com.todo_code.ejercicios_spring_boot.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Patient {
    //id, dni, nombre, apellido, fecha de nacimiento
    String id;
    String name;
    String lastName;
    LocalDate birthDate;

    public Patient(String id, String name, String lastName, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public static List<Patient> getPatients(){
        List<Patient> listPatient = new ArrayList<Patient>();
        listPatient.add(new Patient("p1", "Laura", "Gimena", LocalDate.parse("1978-03-17")));
        listPatient.add(new Patient("p2", "Carlos", "Ramirez", LocalDate.parse("1985-07-22")));
        listPatient.add(new Patient("p3", "Sofía", "Martínez", LocalDate.parse("1992-11-05")));
        listPatient.add(new Patient("p4", "Andrés", "González", LocalDate.parse("1975-09-30")));
        listPatient.add(new Patient("p5", "María", "Fernández", LocalDate.parse("2016-12-14")));
        listPatient.add(new Patient("p6", "Javier", "Torres", LocalDate.parse("1999-01-09")));
        listPatient.add(new Patient("p7", "Natalia", "López", LocalDate.parse("1983-04-18")));
        listPatient.add(new Patient("p8", "Lucas", "Pérez", LocalDate.parse("2010-05-25")));
        listPatient.add(new Patient("p9", "Valeria", "Sánchez", LocalDate.parse("2013-10-12")));
        listPatient.add(new Patient("p10", "Diego", "Mendoza", LocalDate.parse("1988-02-03")));
        listPatient.add(new Patient("p11", "Mónica", "Vargas", LocalDate.parse("1973-06-07")));
        return listPatient;
    }

}
