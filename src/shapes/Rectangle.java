package shapes;

public class Rectangle {

    /**
     *
     * Inside of your shapes directory, create a class named Rectangle. It should have protected properties for both length and width. Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
     *
     * Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:
     *
     * Copied to clipboard
     * perimeter = 2 x length + 2 x width
     * area = length x width
     */

    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {

        return 2 * this.length + 2 * this.width;

    }

    public double getArea() {
        return this.length * this.width;
    }

}
