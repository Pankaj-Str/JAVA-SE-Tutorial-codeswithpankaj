package Day_12;
// p4n.in
// codeswithpankaj.com

public class Car {
    private String make;
    private String model;
    private int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        // Creating objects using the constructor
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Accord", 2021);

        // Accessing object properties using getter methods
        System.out.println("Car 1: " + car1.getMake() + " " + car1.getModel() + " " + car1.getYear());
        System.out.println("Car 2: " + car2.getMake() + " " + car2.getModel() + " " + car2.getYear());
    }
}
