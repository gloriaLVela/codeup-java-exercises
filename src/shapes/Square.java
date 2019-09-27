package shapes;

public class Square extends Quadrilateral{


    public Square(int length) {
        super(length, length);
    }


    @Override void setLength(double length){
        super.length = length;
    }

    @Override void setWidth(double width){
        super.width = width;
    }

    @Override
    public double getPerimeter(){
        return 4 *(super.length);
    };

    @Override
    public double getArea(){
        return super.length * super.length;
    }

}
