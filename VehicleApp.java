
/**
 * Write a description of class VehicleApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VehicleApp
{
     public static void main(String[] args) {
        Car car = new Car(101, "Toyota", 30000, 4, "Petrol");

        Bike bike = new Bike(201, "Honda", 15000, 150);

        System.out.println(" Car Details ");
        car.displayVehicleInfo();
        System.out.println("Tax: $" + car.calculateTax());
        System.out.println("Final Price: $" + car.calculateFinalPrice());
        
        System.out.println(" Bike Details ");
        bike.displayVehicleInfo();
        System.out.println("Tax: $" + bike.calculateTax());
        System.out.println("Final Price: $" + bike.calculateFinalPrice());
    }

}