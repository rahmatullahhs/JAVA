package oop.pets;

public class Dog extends Pets {

    public Dog() {
    }

    @Override
    public void sounds() {
        super.sounds();
        System.out.println("Dog=Ghew Ghew");
    }

}
