import java.util.HashMap;
import java.util.Map;
// Shape interface
interface Shape2 {
    void draw();
}
// Concrete Circle class
class Circle2 implements Shape2 {
    private String color; // Intrinsic property
    private int x, y, radius; // Extrinsic properties
    public Circle2(String color) {
        this.color = color;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void draw() {
        System.out.println("Drawing Circle [Color: " + color + ", x: " + x + ", y: " + y + ", radius: " + radius +
                "]");
    }
}
// ShapeFactory for managing flyweight objects
class ShapeFactory {
    private static final Map<String, Shape> circleMap = new HashMap<>();
    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color: " + color);
        }
        return circle;
    }
}