public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();

        Circle circle = new Circle();
        circle.calculateCircleArea(3);
        circle.calculateCirclePerimeter(4);

        Triangle triangle = new Triangle();
        triangle.calculateTriangleArea(2,2);
        triangle.calculateTrianglePerimeter(3,5,5);

        Square square = new Square();
        square.calculateSquareArea(3);
        square.calculateSquarePerimeter(4);
    }
}
