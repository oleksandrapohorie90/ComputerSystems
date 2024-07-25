package OOP;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.eat();
        dog.breed = "Golden Retriever";
        dog.age = 2;
        dog.color = "Golden";

        dog.printDetails();
        Dog dog1 = new Dog(dog);
        dog1.printDetails();

        Circle circle = new OOP.Circle();
        circle.calculateArea(3);
        circle.calculatePerimeter(4);

        Triangle triangle = new OOP.Triangle();
        triangle.calculateTriangleArea(2,2);
        triangle.calculateTrianglePerimeter(3,5,5);

        Square square = new OOP.Square();
        square.calculateArea(3);
        square.calculatePerimeter(4);

        Animal animal = new Animal();
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
    }
}
