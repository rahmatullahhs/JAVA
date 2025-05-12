package shapearray;

import java.util.Arrays;

public class ShapeArray {

    public static void main(String[] args) {


Shape[] shapes=new Shape[3];


shapes [0]=new Circle(5);
shapes [1]=new Triangle(6, 7);
shapes [2]=new Ractangle(10, 23);


        for (int i = 0; i < shapes.length; i++) {
            
            System.out.println("Area of shape "  + shapes[i].toString() +" :" + shapes[i].area());
            
        }





    }

}
