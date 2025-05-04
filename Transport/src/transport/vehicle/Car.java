
package transport.vehicle;


public class Car extends Vehicle{
    
    int numberOfDoors;

    public Car() {
    }

    public Car(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Car(int numberOfDoors, String brand, int speed) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    /**
     *
     */
    @Override
    public void carDetails() {
        super.carDetails(); 
        System.out.println("Doors:" + numberOfDoors);
    }

   
    
    
}
