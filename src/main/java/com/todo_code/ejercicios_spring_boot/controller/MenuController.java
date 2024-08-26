package com.todo_code.ejercicios_spring_boot.controller;

import com.todo_code.ejercicios_spring_boot.models.Menu;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.todo_code.ejercicios_spring_boot.models.Menu.infoMenu;

@RestController
public class MenuController {

    //Return a main course and status OK, and if the main course  is not found, return 404
    @GetMapping("/menu")
    @ResponseBody
    ResponseEntity<Menu> menu(@RequestParam int mainCourseClient) {
        List<Menu> menu = infoMenu();
        Menu result = null;

        for (Menu mainCourse : menu) {
            int numPlato = mainCourse.getNumPlato();
            if (numPlato == mainCourseClient) {
                result = mainCourse;
            }
        }
        if (result != null) {
            return new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
    }
}
