// Базовий клас геометричних фігур
class GeometricFigure {
    // Метод для розрахунку площі фігури
    public double calculateArea() {
        return 0.0;
    }

    // Метод для розрахунку об'єму фігури
    public double calculateVolume() {
        return 0.0;
    }
}

// Підклас для трикутника
class Triangle extends GeometricFigure {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Підклас для квадрата
class Square extends GeometricFigure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

// Підклас для прямокутника
class Rectangle extends GeometricFigure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Підклас для куба
class Cube extends GeometricFigure {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateVolume() {
        return side * side * side;
    }
}

// Підклас для піраміди
class Pyramid extends GeometricFigure {
    private double baseArea;
    private double height;

    public Pyramid(double baseArea, double height) {
        this.baseArea = baseArea;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * baseArea * height;
    }
}

// Підклас для кола
class Circle extends GeometricFigure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Підклас для сфери
class Sphere extends GeometricFigure {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

