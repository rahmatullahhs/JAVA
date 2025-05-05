package oop.pets;

public class Cat extends Pets {

    public Cat() {
    }

    @Override
    public void sounds() {
        super.sounds();
        System.out.println("Cat=Meow");
    }

}
