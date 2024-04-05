public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3.15);
        Shape square = new Square(10.5);
        Shape rectangle = new Rectangle(20.4, 10.4);

        Visitor areaCalculator = new AreaCalculator();

        System.out.println(circle.getType());
        circle.accept(areaCalculator);

        System.out.println(square.getType());
        square.accept(areaCalculator);

        System.out.println(rectangle.getType());
        rectangle.accept(areaCalculator);
    }
}