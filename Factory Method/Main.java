import Factory.Polygon;
import Factory.PolygonFactory;

public class Main{
    public static void main(String[] args){
        
        String type = "Circle"; //Options allowed: Circle, Triangle or Square.
        
        Polygon polygon = PolygonFactory.getPolygon(type);

        System.out.println(polygon.getNumberOfSides());
    }
}