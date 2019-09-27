package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int length, int width) {
        super(length, width);
    }
    @Override void setWidth(double width){
        super.width = width;
    };

    @Override void setLength(double length){
        super.length = length;
    }

    @Override
    public double getPerimeter(){
        return 2 *(this.length + this.width);
    };

    @Override
    public double getArea(){
        return this.length * this.width;
    }
}

