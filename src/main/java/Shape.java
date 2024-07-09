public abstract class Shape {
    final double PI = 3.14159;

    public void calculateCircleArea(int radius) {
        System.out.println("The area of the circle is: " + (PI * Math.pow(radius, 2)));
    }

    public void calculateCirclePerimeter(int radius) {
        System.out.println("The perimeter of the circle is: " + (2 * PI * radius));
    }

    public void calculateTriangleArea(int base, int height) {
        System.out.println("The area of the triangle is: " + (base * height) / 2);
    }

    public void calculateTrianglePerimeter(int side1, int side2, int side3) {
        System.out.println("The perimeter of the triangle is: " + side1 * side2 * side3);
    }

    public void calculateSquareArea(int diameter) {
        System.out.println("The area of the square is: " + Math.pow(diameter, 2) / 2);
    }

    public void calculateSquarePerimeter(int side) {
        System.out.println("The perimeter of the square is: " + (4 * side));
    }


}
