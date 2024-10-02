package circulo;

public class Cylinder extends Circle {
    private double height;

    // Constructor por defecto
    public Cylinder() {
        super(); // Llama al constructor por defecto de Circle
        this.height = 1.0;
    }

    // Constructor con radius
    public Cylinder(double radius) {
        super(radius); // Llama al constructor de Circle con radius
        this.height = 1.0; // Valor por defecto
    }

    // Constructor con radius y height
    public Cylinder(double radius, double height) {
        super(radius); // Llama al constructor de Circle con radius
        this.height = height;
    }

    // Constructor con radius, height y color
    public Cylinder(double radius, double height, String color) {
        super(radius, color); // Llama al constructor de Circle con radius y color
        this.height = height;
    }

    // Getter para height
    public double getHeight() {
        return height;
    }

    // Setter para height
    public void setHeight(double height) {
        this.height = height;
    }

    // Método para calcular el volumen del cilindro
    public double getVolume() {
        return getArea() * height; // Usa el método getArea() de Circle
    }

    // Método toString
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}
