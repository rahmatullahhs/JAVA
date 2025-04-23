
package classlearning;

import classlearning.Classl.Circle;


public class ClassLearning {

    public static void main(String[] args) {
        
        Circle circle=new Circle();
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimiter());
        
        
        circle.setRadius(3);
        
        System.out.println(circle.getArea());
        
        System.out.println(circle.getPerimiter());
        
    }   
}
