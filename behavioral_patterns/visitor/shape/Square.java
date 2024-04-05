public class Square implements Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitForSquare(this);
    }
}
