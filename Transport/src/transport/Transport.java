package transport;

import transport.vehicle.Bike;
import transport.vehicle.Car;
import transport.vehicle.Vehicle;

public class Transport {

    public static void main(String[] args) {

        Car c = new Car(6, "Nissan", 350);
        c.carDetails();

        Bike b = new Bike(1, "BMW", 250);
        b.bikeDetails();

    }

}
