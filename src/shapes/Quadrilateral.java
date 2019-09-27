package shapes;

abstract class Quadrilateral extends Shape implements Measurable{

    protected double length;
    protected double width;

    Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getWidth(){
        return this.width;
    }

    abstract void setWidth(double width);

    public double getLength(){
        return this.length;
    }

    abstract void setLength(double length);

    public double getPerimeter(){
        return 2 *(this.length + this.width);
    };

    public double getArea(){
        return this.length * this.width;
    }
}
