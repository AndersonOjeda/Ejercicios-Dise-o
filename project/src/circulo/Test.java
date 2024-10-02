package circulo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos para el círculo
        System.out.println("Ingrese el radio del círculo:");
        double radius = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        
        System.out.println("Ingrese el color del círculo:");
        String color = scanner.nextLine();

        // Crear un objeto Circle con los datos ingresados
        Circle circle = new Circle(radius, color);
        System.out.println("\nDatos del círculo:");
        System.out.println(circle); // Imprime Circle[radius=valor,color=valor]
        System.out.println("Área del círculo: " + circle.getArea());

        // Entrada de datos para el cilindro
        System.out.println("\nIngrese la altura del cilindro:");
        double height = scanner.nextDouble();

        // Crear un objeto Cylinder con los datos ingresados
        Cylinder cylinder = new Cylinder(radius, height, color);
        System.out.println("\nDatos del cilindro:");
        System.out.println(cylinder); // Imprime Cylinder: subclass of Circle[radius=valor,color=valor] height=valor
        System.out.println("Volumen del cilindro: " + cylinder.getVolume());

        // Cerrar el scanner
        scanner.close();
    }
}
