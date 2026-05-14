package app;
interface Shape {
    double getArea();
}
class Circle implements Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
class Square implements Shape {
    double side;
    Square(double side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return side * side;
    }
}
class Triangle implements Shape {
    double base;
    double height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public double getArea() {
        return (base * height) / 2;
    }
}
public class Main {
    public static double totalArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.getArea();
        }
        return sum;
    }
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(7.62), new Square(4.5), new Triangle(6.3, 3.3)};
        for (Shape shape : shapes) {
            System.out.println("Площа фігури: " + shape.getArea());
        }
        System.out.println("Сумарна площа: " + totalArea(shapes)
        );
    }
}