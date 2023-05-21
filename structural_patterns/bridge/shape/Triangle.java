package shape;

import color.IColor;

public class Triangle extends Shape {

    public Triangle(IColor color){
        super("Triangle", color);
    }

    @Override
    public void displayColor() {
        color.applyColor(name);
    }
}
