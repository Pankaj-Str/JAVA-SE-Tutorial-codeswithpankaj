package p4n;

public class Car {
  
    private String companyName;
    private String modelName;
    private int year;
    private double mileage;

    
    public Car(String companyName, String modelName, int year, double mileage) {
        this.companyName = companyName;
        this.modelName = modelName;
        this.year = year;
        this.mileage = mileage;
    }

    
    public String getCompanyName() {
        return companyName;
    }

   
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    
    public String getModelName() {
        return modelName;
    }

    
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

 
    public int getYear() {
        return year;
    }

   
    public void setYear(int year) {
        this.year = year;
    }

   
    public double getMileage() {
        return mileage;
    }

    public static void main(String[] args) {
       
        Car car = new Car("Toyota", "Camry", 2020, 30.5);


        System.out.println("Initial Company Name: " + car.getCompanyName());
        System.out.println("Initial Model Name: " + car.getModelName());
        System.out.println("Initial Year: " + car.getYear());
        System.out.println("Initial Mileage: " + car.getMileage());

        car.setCompanyName("Honda");
        car.setModelName("p4n");
        car.setYear(2019);
        // Direct access to mileage for demonstration
        car.mileage = 35.2;

        System.out.println("\nUpdated Company Name: " + car.getCompanyName());
        System.out.println("Updated Model Name: " + car.getModelName());
        System.out.println("Updated Year: " + car.getYear());
        System.out.println("Updated Mileage: " + car.getMileage());
    }
}
