package OOP;

public class Square extends Shape {

    @Override
    public void calculateArea(int diameter) {
        System.out.println("The area of the square is: " + Math.pow(diameter, 2) / 2);
    }


    @Override
    public void calculatePerimeter(int side) {
        System.out.println("The perimeter of the square is: " + (4 * side));
    }
}
