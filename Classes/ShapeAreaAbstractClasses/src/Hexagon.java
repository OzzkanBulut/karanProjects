public class Hexagon extends Shape {
    private int edge;

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }

    public Hexagon(int edge){
        this.edge = edge;
    }
    @Override
    public void calculatePerimeter() {
        int perimeter = edge * 6;
        System.out.println("Perimeter of hexagon : " + perimeter);
    }

    @Override
    public void calculateArea() {
        double area = (double) (Math.pow(3, 0.5) * 3 * edge * edge) / 2;
        System.out.println("Area of hexagon : " + area);
    }
}
