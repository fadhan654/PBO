public class Triangle extends Shape {
    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
}

// Segitiga Siku-Siku
class RightTriangle extends Triangle {
    public RightTriangle(double base, double height) {
        super(base, height, Math.sqrt(base * base + height * height));
    }

    double area() {
        return 0.5 * side1 * side2;
    }

    double perimeter() {
        return side1 + side2 + side3;
    }
}

// Segitiga Sama Sisi
class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
    }

    double area() {
        return Math.sqrt(3) / 4 * side1 * side1;
    }

    double perimeter() {
        return 3 * side1;
    }
}

// Segitiga saama Kaki
class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double base, double height) {
        super(base, height, Math.sqrt((base * base) + (height * height) / 4));
    }

    double area() {
        return 0.5 * side1 * side2;
    }

    double perimeter() {
        return side1 + side2 + side3;
    }
}
