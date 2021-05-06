package Factory;

public class PolygonFactory {
    public static Polygon getPolygon(String type){

        switch (type) {
            case "Circle":
                return new Circle();
            case "Triangle":
                return new Triangle();
            case "Square":
                return new Square();
            default:
                break;
        }

        return null;
    }
}
