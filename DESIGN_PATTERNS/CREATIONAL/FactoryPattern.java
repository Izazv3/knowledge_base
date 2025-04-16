package DESIGN_PATTERNS.CREATIONAL;

public class FactoryPattern {

    public static Shape getShape(String type) {

        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("square")) {
            return new Square();
        }

        return null;

    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("drawing circle");

    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("drawing square");

    }

}

// public static void main(String[] args) {
// Shape shape = FactoryPattern.getShape("circle");
// shape.draw();
// }