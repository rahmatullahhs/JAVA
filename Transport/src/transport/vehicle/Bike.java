
package transport.vehicle;


public class Bike extends Vehicle{
    
    int hasCarrier;

    public Bike() {
    }

    public Bike(int hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    public Bike(int hasCarrier, String brand, int speed) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    public int getHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(int hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void bikeDetails() {
        super.bikeDetails(); 
System.out.println("Carriers:" + hasCarrier);
    }
    
    
    
}
