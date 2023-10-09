package geometric.shapes;

public class Cube {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double calculateVolume() {
        return side * side * side;
    }
}
