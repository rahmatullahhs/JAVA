
package zoo;

import zoo.animal.Animal;
import zoo.animal.Cat;
import zoo.animal.Dog;



public class Zoo {

    public static void main(String[] args) {

        Animal myDog= new Dog();
        Animal myCat= new Cat();
        
        myDog.makeSound();
        
        myCat.makeSound();
        
        
    }
    
}
