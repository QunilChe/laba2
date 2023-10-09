package geometric.shapes;

import geometric.shapes.*;

public class Main {
    public static void main(String[] args) {
        // Create objects for various geometric shapes
        Triangle triangle = new Triangle(5, 4);
        Square square = new Square(6);
        Rectangle rectangle = new Rectangle(4, 8);
        Cube cube = new Cube(3);
        Pyramid pyramid = new Pyramid(20, 7);
        Circle circle = new Circle(5);
        Sphere sphere = new Sphere(3);

        // Calculate and display their areas and volumes
        double triangleArea = triangle.calculateArea();
        System.out.println("Triangle Area: " + triangleArea);

        double squareArea = square.calculateArea();
        System.out.println("Square Area: " + squareArea);

        double rectangleArea = rectangle.calculateArea();
        System.out.println("Rectangle Area: " + rectangleArea);

        double cubeVolume = cube.calculateVolume();
        System.out.println("Cube Volume: " + cubeVolume);

        double pyramidVolume = pyramid.calculateVolume();
        System.out.println("Pyramid Volume: " + pyramidVolume);

        double circleArea = circle.calculateArea();
        System.out.println("Circle Area: " + circleArea);

        double sphereVolume = sphere.calculateVolume();
        System.out.println("Sphere Volume: " + sphereVolume);
    }
}