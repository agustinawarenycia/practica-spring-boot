package com.todo_code.ejercicios_spring_boot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Menu {
    int numPlato;
    String nombre;
    double precio;
    String descripcion;

    public Menu(int numPlato, String nombre, double precio, String descripcion) {
        this.numPlato = numPlato;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public static List<Menu> infoMenu() {
        List<Menu> menu = new ArrayList<Menu>();
        menu.add(new Menu(1, "pollo", 2.33, "Pollo asado"));
        menu.add(new Menu(2, "carne", 3.33, "Carne asado"));
        menu.add(new Menu(3, "pescado", 5, "PEscado asado"));
        menu.add(new Menu(4, "merlusa", 5, "Paty de merlusa y salmon"));
        menu.add(new Menu(5, "Milanesa", 9.99, "Milas de carne con pure"));
        return menu;
    }


}
