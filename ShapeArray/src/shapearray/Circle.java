package shapearray;

public class Circle extends Shape {

    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle " ;
    }

    
    
    
    
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

}
