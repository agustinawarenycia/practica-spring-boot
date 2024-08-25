package com.todo_code.ejercicios_spring_boot.controller;

import com.todo_code.ejercicios_spring_boot.models.Menu;
import com.todo_code.ejercicios_spring_boot.models.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/*

  @author agus_
 */

import static com.todo_code.ejercicios_spring_boot.models.Menu.infoMenu;

@RestController
public class Controller {
    @GetMapping("/hello")
    public String say_hello() {
        return "First test";
    }

    @GetMapping("/bye")
    public String say_bye() {
        return "Second test";
    }

    @GetMapping("greeting/{salute}")
    public String salute(@PathVariable String salute) {
        return "The salute is:" + salute;
    }


    @GetMapping("/names")
    public String more_params(@RequestParam String name,
                              @RequestParam int age) {
        return "Your name is:" + name + "\n" +
                "You have: " + age +"years old";
    }

    //First exercise
    @GetMapping("/gasoline")
    public String amount_of_gasoline(@RequestParam int gallons) {
        double total_liters = gallons * 3.78541;
        return "Total of liters is : " + total_liters;
    }

    //POST method with body request -> @RequestBody
    @PostMapping("/person")
    public String crearPersona(@RequestBody Person p1) {
        return "El nombre es: " + p1.getName() + "\n" +
                "El apellido es: " + p1.getLast_name() + "\n" +
                "La age es: " + p1.getAge();
    }

    @GetMapping("/clients")
    @ResponseBody
    public List<Person> get_clients() {

        List<Person> list_of_clients = new ArrayList<Person>();
        list_of_clients.add(new Person("Juana", "Perez", 23));
        list_of_clients.add(new Person("Ramon", "Martinez", 65));
        list_of_clients.add(new Person("Angel", "Duran", 40));

        return list_of_clients;
    }

    //Custom http status response
    @GetMapping("/responses")
    ResponseEntity<String> test_status_code() {
        return new ResponseEntity<>("This is the response body", HttpStatus.CREATED);
    }


    //Return a main course and status OK, and if the main course  is not found, return 404
    @GetMapping("/menu")
    @ResponseBody
    ResponseEntity<Menu> menu(@RequestParam int main_course_client) {
        List<Menu> menu = infoMenu();
        Menu result = null;

        for (Menu main_course : menu) {
            int numPlato = main_course.getNumPlato();
            if (numPlato == main_course_client) {
                result = main_course;
            }
        }
        if (result != null) {
            return new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
    }

}
