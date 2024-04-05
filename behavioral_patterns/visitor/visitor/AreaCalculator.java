public class AreaCalculator implements Visitor{

    @Override
    public void visitForSquare(Shape shape) {
        System.out.println( "Calculating area for Square...");
    }

    @Override
    public void visitForRectangle(Shape shape) {
        System.out.println( "Calculating area for Rectangle...");
    }

    @Override
    public void visitForCircle(Shape shape) {
        System.out.println( "Calculating area for Circle...");
    }
    
}
