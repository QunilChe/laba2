package geometric.shapes;

public class Sphere {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double calculateVolume() {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }
}