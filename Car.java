
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
    int numberOfDoors;
    String fuelType;

    public Car(int vehicleId, String brand, double basePrice, int numberOfDoors, String fuelType) {
        super(vehicleId, brand, basePrice); 
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    public double calculateFinalPrice() {
        double tax = super.calculateTax();
        double luxuryCharge = basePrice * 0.05;
        return basePrice + tax + luxuryCharge;
    }

    public void displayVehicleInfo() {
        super.displayVehicleInfo(); 
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Fuel Type: " + fuelType);
    }
}