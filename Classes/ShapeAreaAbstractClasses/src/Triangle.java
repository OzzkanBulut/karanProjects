public class Triangle extends Shape{
    private int edge1;
    private int edge2;

    private int edge3;

    public Triangle(int edge1, int edge2,int edge3){
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }

    @Override
    public void calculatePerimeter() {
        int perimeter = edge1+edge2+edge3;
        System.out.println("Perimeter of Triangle : "+perimeter );
    }

    @Override
    public void calculateArea() {
    int area = edge1*edge3*edge2;
        System.out.println("Area of triangle : "+ area);
    }


    public int getEdge1() {
        return edge1;
    }

    public void setEdge1(int edge1) {
        this.edge1 = edge1;
    }

    public int getEdge2() {
        return edge2;
    }

    public void setEdge2(int edge2) {
        this.edge2 = edge2;
    }

    public int getEdge3() {
        return edge3;
    }

    public void setEdge3(int edge3) {
        this.edge3 = edge3;
    }
}