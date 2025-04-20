/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circlelearning.Circle;

/**
 *
 * @author Admin
 */
public class Circle {
    
    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    
    
    public  double  getArea(){
    
    double area=Math.PI*Math.pow(radius, 2);
    
    return area;
    }
 
    
       public  double  getPerimeter(){
    
    double Perimeter=2*Math.PI*radius;
    
    return Perimeter;
    }
    
    
    
    public void setRadious(double newRadius){
    
        this.radius=newRadius;
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
