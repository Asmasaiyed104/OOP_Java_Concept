//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("Model premium","Tesla", "Red",2023, "Sedan");

        myCar.printCarDetails();

        Bike myBike = new Bike("XYZXYZ", "Honda", "Black", 2021, 2);
        myBike.printBikeDetails();

        Truck myTruck = new Truck("xxxyyy","","Yellow",2020,10);
        myTruck.printTruckDetails();
    }
}