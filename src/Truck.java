public class Truck extends Vehicle{

    int loadCapacity;

    public Truck(String model, String make, String color, int year, int loadCapacity) {
        super(model, make, color, year);
        this.loadCapacity = loadCapacity;
    }

    public  void printTruckDetails(){
        printDetails();
        System.out.println("Load Capacity : " + loadCapacity);
    }
}
