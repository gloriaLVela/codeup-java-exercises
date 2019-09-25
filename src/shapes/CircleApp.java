package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input keyboard = new Input();
        // double radius = keyboard.getDouble();
        Circle newCircle = new Circle(keyboard.getDouble("Please enter the radius: "));
        System.out.println("The circle area : " + newCircle.getArea());
        System.out.println("The circumference : " + newCircle.getCircumference());

    }

}
