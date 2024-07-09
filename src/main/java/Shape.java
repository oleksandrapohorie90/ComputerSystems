public abstract class Shape {
    final double PI = 3.14159;

    public void calculateCircleArea(int radius) {
        System.out.println("The area of the circle is: " + (PI * Math.pow(radius, 2)));
    }

    public void calculateCirclePerimeter(int radius) {
        System.out.println("The perimeter of the circle is: " + (2 * PI * radius));
    }

    public void calculateTriangleArea(int base, int height) {
        System.out.println("The area of the triangle is: " + (base * height)/2);
    }

    public void calculateTrianglePerimeter(int side1, int side2, int side3){
        System.out.println("The perimeter of the triangle is: " + (2 * PI * radius));
    }
//    public void calculateSquareArea();
//    public void calculateSquarePerimeter();


}
