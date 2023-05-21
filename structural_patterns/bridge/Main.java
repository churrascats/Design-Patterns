import color.Blue;
import color.IColor;
import color.Red;
import shape.*;

public class Main {
    
    public static void main(String[] args){
        
        IColor redColor = new Red();
        IColor blueColor = new Blue();

        Shape blueTriangle = new Triangle(blueColor);
        Shape redTriangle = new Triangle(redColor);

        Shape blueSquare = new Square(blueColor);
        Shape redSquare = new Square(redColor);

        blueTriangle.displayColor();
        redTriangle.displayColor();
        
        blueSquare.displayColor();
        redSquare.displayColor();
    }
}
