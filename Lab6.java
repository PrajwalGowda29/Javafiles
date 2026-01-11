abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Triangle subclass
class Triangle extends Shape {
    private double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double calculateArea() {
        // Heron's Formula
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    double calculatePerimeter() {
        return a + b + c;
    }
}

// Main class
public class ShapeDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}
