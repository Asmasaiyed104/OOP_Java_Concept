public class Bike extends Vehicle{
int passengerCapacity;

    public Bike(String model, String make, String color, int year, int passengerCapacity) {
        super(model, make, color, year);
        this.passengerCapacity = passengerCapacity;
    }

    public void printBikeDetails() {
        printDetails();
        System.out.println("Passenger Capacity : " + passengerCapacity);
    }
}
