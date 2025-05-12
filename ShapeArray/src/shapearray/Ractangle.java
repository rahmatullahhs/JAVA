

package shapearray;


public class Ractangle extends Shape{
    
    double hight,wight;

    public Ractangle() {
    }

    public Ractangle(double hight, double wight) {
        this.hight = hight;
        this.wight = wight;
    }

    @Override
    public double area() {
         return hight*wight;
    }

    @Override
    public String toString() {
        return "Ractangle :";
    }
    
    
    
}
