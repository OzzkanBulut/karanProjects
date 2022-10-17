public class Square extends Shape {

    private int edge;

    public Square(int edge){
        this.edge = edge;
    }

    @Override
    public void calculatePerimeter() {
        int perimeter = edge*4;
        System.out.println("Perimeter of square : " + perimeter );
    }

    @Override
    public void calculateArea() {
        int area = edge*edge;
        System.out.println("Area of square : " + area);

    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }
}
