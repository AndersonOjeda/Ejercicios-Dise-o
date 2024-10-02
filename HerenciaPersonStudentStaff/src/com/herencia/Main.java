package com.herencia;

public class Main {
    public static void main(String[] args) {
        // Creación de objetos Student y Staff
        Student student = new Student("Jojan", "Pasto", "Ingeniería", 2024, 3000.0);
        Staff staff = new Staff("Carlos", "Bogotá", "UCC", 5000.0);

        // Imprimir los objetos
        System.out.println(student);
        System.out.println(staff);
    }
}
