package com.shapes;

public class Main {
    public static void main(String[] args) {
        // Prueba de Shape
        Shape shape = new Shape("blue", false);
        System.out.println(shape);

        // Prueba de Circle
        Circle circle = new Circle(5.5, "green", true);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Prueba de Rectangle
        Rectangle rectangle = new Rectangle(2.0, 4.0, "yellow", true);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Prueba de Square
        Square square = new Square(3.0, "purple", false);
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}
