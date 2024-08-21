public class Vehicle {
    String model;
    String make;
    String color;
    int year;

    public Vehicle(String model, String make, String color, int year) {
        this.model = model;
        this.make = make;
        this.color = color;
        this.year = year;
    }

    public void printDetails(){
        System.out.println("Model : " + model + ", Make : " + make + ", Color : " + color + ", Year : " + year );
    }
}
