package shapes;

public class Square extends Rectangle {
    /**
     *
     * Create a class named Square, also inside of shapes, that extends Rectangle.
     * Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
     */

    private double side;

    public Square(double side) {
        super(side, side);
       // this.side = side;
    }

    @Override public double getPerimeter() {

        //return 2 * this.length + 2 * this.width;
        return 4 * side; //perimeter = 4 x side

    }

    @Override public double getArea() {
        // area = side ^ 2
        return Math.pow(side, 2);
        //return this.length * this.width;
    }
}
