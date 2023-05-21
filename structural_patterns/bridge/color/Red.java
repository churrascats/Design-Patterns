package color;

public class Red implements IColor{

    String color;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Red() {
    }

    @Override
    public void applyColor(String name) {
        setColor("red");
        System.out.println("Applying " + color + " color to " + name);
    }
    
    
}
