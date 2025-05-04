
package transport.vehicle;


public class Vehicle {
    String brand;
    int speed;

    public Vehicle() {
    }

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    
    public void carDetails(){
        System.out.println("Car's Details");
        System.out.println("Car's Brand" + brand);
        System.out.println("Top speed" + speed);
      
    
    }
    
        public void bikeDetails(){
        System.out.println("Bike's Details");
        System.out.println("Bike's Brand" + brand);
        System.out.println("Top speed" + speed);}
    
    
   
    
    
}
