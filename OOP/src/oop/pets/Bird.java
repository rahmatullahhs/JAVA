
package oop.pets;


public class Bird extends Pets{



    public Bird() {
    }

    @Override
    public void sounds() {
        super.sounds(); 
         System.out.println("Bird=tweet tweet");
    }
    
    
    
}
