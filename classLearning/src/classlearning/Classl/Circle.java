
package classlearning.Classl;

public class Circle {
 
    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    
   public double getArea(){
   
   double area= Math.PI* Math.pow(radius, 2);
   return area;
   
   }
    
    
    public double getPerimiter(){
   
   double Perimiter= 2*Math.PI* radius;
   return Perimiter;
   
   }
    
    public void setRadius(double radius){
    this.radius=radius; 
    
    }
    
    
    
    
    
    
    
    
}
