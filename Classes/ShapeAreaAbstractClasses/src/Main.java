public class Main {
    public static void main(String[] args) {
    Shape square = new Square(4);
    Shape hexagon = new Hexagon(8);
    Shape triangle = new Triangle(12,2,7);

    square.calculateArea();
    square.calculatePerimeter();

    hexagon.calculatePerimeter();
    hexagon.calculateArea();

    }
}