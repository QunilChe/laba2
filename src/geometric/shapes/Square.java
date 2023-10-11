package geometric.shapes;

public class Square extends GeometricShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculateVolume() {
        return 0;  // Квадрат - це 2D фігура, тому об'єм рівний 0.
    }
}
