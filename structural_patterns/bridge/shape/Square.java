package shape;

import color.IColor;

public class Square extends Shape{
    
    public Square(IColor color){
        super("Square", color);
    }

    @Override
    public void displayColor() {
        color.applyColor(name);
    }
}
