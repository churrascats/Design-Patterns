public class Rectangle implements Shape {

    private double l;
    private double b;

    public Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitForRectangle(this);
    }

}
