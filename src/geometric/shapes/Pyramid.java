package geometric.shapes;

public class Pyramid {
    private double baseArea;
    private double height;

    public Pyramid(double baseArea, double height) {
        this.baseArea = baseArea;
        this.height = height;
    }

    public double calculateVolume() {
        return (1.0 / 3) * baseArea * height;
    }
}