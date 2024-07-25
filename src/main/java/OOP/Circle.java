package OOP;

public class Circle extends Shape {

    @Override
    public void calculateArea(int radius) {
        System.out.println("The area of the circle is: " + (PI * Math.pow(radius, 2)));
    }

    @Override
    public void calculatePerimeter(int radius) {

        System.out.println("The perimeter of the circle is: " + (2 * PI * radius));
    }

}
