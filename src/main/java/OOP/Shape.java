package OOP;

public abstract class Shape{
    final double PI = 3.14159;

    public abstract void calculateArea(int radius);

    public abstract void calculatePerimeter(int radius);


    public void calculateTriangleArea(int base, int height) {
        System.out.println("The area of the triangle is: " + (base * height) / 2);
    }

    public void calculateTrianglePerimeter(int side1, int side2, int side3) {
        System.out.println("The perimeter of the triangle is: " + side1 * side2 * side3);
    }


}
