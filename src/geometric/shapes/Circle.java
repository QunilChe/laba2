package geometric.shapes;

public class Circle extends GeometricShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculateVolume() {
        return 0;  // Коло - це 2D фігура, тому об'єм рівний 0.
    }

}