public class Main1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Елементи стеку:");
        for (int element : stack.iterable()) {
            System.out.println(element);
        }

        int poppedElement = stack.pop();
        System.out.println("Видалено зі стеку: " + poppedElement);











        // Приклад використання класів для розрахунку площі та об'єму фігур
        GeometricFigure triangle = new Triangle(5, 4);
        GeometricFigure square = new Square(3);
        GeometricFigure rectangle = new Rectangle(6, 7);
        GeometricFigure cube = new Cube(2);
        GeometricFigure pyramid = new Pyramid(10, 8);
        GeometricFigure circle = new Circle(4);
        GeometricFigure sphere = new Sphere(5);

        System.out.println("Площа трикутника: " + triangle.calculateArea());
        System.out.println("Площа квадрата: " + square.calculateArea());
        System.out.println("Площа прямокутника: " + rectangle.calculateArea());
        System.out.println("Об'єм куба: " + cube.calculateVolume());
        System.out.println("Об'єм піраміди: " + pyramid.calculateVolume());
        System.out.println("Площа кола: " + circle.calculateArea());
        System.out.println("Об'єм сфери: " + sphere.calculateVolume());











    }
}
