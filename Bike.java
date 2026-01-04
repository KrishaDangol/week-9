
/**
 * Write a description of class Bike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bike extends Vehicle
{
    int engineCapacity;

    public Bike(int vehicleId, String brand, double basePrice, int engineCapacity) {
        super(vehicleId, brand, basePrice);
        this.engineCapacity = engineCapacity;
    }

    public double calculateFinalPrice() {
        double tax = super.calculateTax(); 
        return basePrice + tax;
    }

    public void displayVehicleInfo() {
        super.displayVehicleInfo(); 
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
    }
}