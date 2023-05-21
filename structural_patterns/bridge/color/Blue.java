package color;

public class Blue implements IColor{
    String color;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Blue() {
    }

    @Override
    public void applyColor(String name) {
        setColor("blue");
        System.out.println("Applying " + color + " color to " + name);
    }
    
}
