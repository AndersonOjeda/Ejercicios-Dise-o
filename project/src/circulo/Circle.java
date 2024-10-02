package circulo;

public class Circle {
    private double radius;
    private String color;

    // Constructor por defecto
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Constructor con solo radius
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red"; // Valor por defecto
    }

    // Constructor con radius y color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter para radius
    public double getRadius() {
        return radius;
    }

    // Setter para radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter para color
    public String getColor() {
        return color;
    }

    // Setter para color
    public void setColor(String color) {
        this.color = color;
    }

    // Método para calcular el área del círculo
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Método toString
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}

