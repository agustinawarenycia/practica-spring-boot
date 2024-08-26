package com.todo_code.ejercicios_spring_boot.controller;

import com.todo_code.ejercicios_spring_boot.models.Menu;
import com.todo_code.ejercicios_spring_boot.models.Patient;
import com.todo_code.ejercicios_spring_boot.models.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

/*

  @author agus_
 */

import static com.todo_code.ejercicios_spring_boot.models.Menu.infoMenu;
import static com.todo_code.ejercicios_spring_boot.models.Patient.getPatients;

@RestController
public class Controller {
    @GetMapping("/hello")
    public String sayHello() {
        return "First test";
    }

    @GetMapping("/bye")
    public String sayBye() {
        return "Second test";
    }

    @GetMapping("greeting/{salute}")
    public String salute(@PathVariable String salute) {
        return "The salute is:" + salute;
    }


    @GetMapping("/names")
    public String moreParams(@RequestParam String name,
                             @RequestParam int age) {
        return "Your name is:" + name + "\n" +
                "You have: " + age +"years old";
    }

    //First exercise
    @GetMapping("/gasoline")
    public String amountOfGasoline(@RequestParam int gallons) {
        double totalLiters = gallons * 3.78541;
        return "Total of liters is : " + totalLiters;
    }

    //POST method with body request -> @RequestBody
    @PostMapping("/person")
    public String crearPersona(@RequestBody Person p1) {
        return "El nombre es: " + p1.getName() + "\n" +
                "El apellido es: " + p1.getLastName() + "\n" +
                "La age es: " + p1.getAge();
    }

    @GetMapping("/clients")
    @ResponseBody
    public List<Person> getClients() {
        List<Person> listOfClients = new ArrayList<Person>();
        listOfClients.add(new Person("Juana", "Perez", 23));
        listOfClients.add(new Person("Ramon", "Martinez", 65));
        listOfClients.add(new Person("Angel", "Duran", 40));

        return listOfClients;
    }

    //Custom http status response
    @GetMapping("/responses")
    ResponseEntity<String> testStatusCode() {
        return new ResponseEntity<>("This is the response body", HttpStatus.CREATED);
    }







}
