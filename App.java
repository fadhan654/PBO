public class App {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        Circle circle = new Circle(3);
        RightTriangle rightTriangle = new RightTriangle(3, 4);
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5);
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(4, 6);

        // Menampilkan Output
        System.out.println("Name: Fadhlan Subhan Fadilah");
        System.out.println("NIM: 20220040183");

        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());

        System.out.println("\nCircle:");
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());

        System.out.println("\nRight Triangle:");
        System.out.println("Area: " + rightTriangle.area());
        System.out.println("Perimeter: " + rightTriangle.perimeter());

        System.out.println("\nEquilateral Triangle:");
        System.out.println("Area: " + equilateralTriangle.area());
        System.out.println("Perimeter: " + equilateralTriangle.perimeter());

        System.out.println("\nIsosceles Triangle:");
        System.out.println("Area: " + isoscelesTriangle.area());
        System.out.println("Perimeter: " + isoscelesTriangle.perimeter());
    }
}