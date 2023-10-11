package geometric.shapes;

public class Pyramid extends GeometricShape {
    private double baseArea;
    private double height;

    public Pyramid(double baseArea, double height) {
        this.baseArea = baseArea;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        // Формула площі піраміди: A = (baseArea) + (0.5 * perimeter * slantHeight), де perimeter - довжина основи, slantHeight - схилення піраміди
        double perimeter = Math.sqrt(4 * baseArea); // Для квадрата, довжина основи - 4 * сторона
        double slantHeight = Math.sqrt(Math.pow(height, 2) + Math.pow(perimeter / 2, 2));
        double surfaceArea = baseArea + (0.5 * perimeter * slantHeight);
        return surfaceArea;
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3) * baseArea * height;
    }
}