package shape;

import color.IColor;

public abstract class Shape {
    public String name;

    protected IColor color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shape(String name, IColor color) {
        this.name = name;
        this.color = color;
    }

    abstract public void displayColor();
}
