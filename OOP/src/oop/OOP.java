
package oop;

import oop.pets.Bird;
import oop.pets.Cat;
import oop.pets.Dog;
import oop.pets.Pets;

public class OOP {

    public static void main(String[] args) {

        Pets myDog = new Dog();
        Pets myCat = new Cat();
        Pets myBird = new Bird();
      
        
        myDog.sounds();
        myCat.sounds();
        myBird.sounds();

    }

}
