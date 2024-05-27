import java.util.ArrayList;

public class Car {

    // Properties of Car

    public String name;
    public String brand;
    public int gears;
    public String manufactureDate;
    public ArrayList<String> features; // Generic ArrayList
    public double price;

    // Parameterized Constructor

    Car(String name, String brand, int gears, String manufacturedate, ArrayList<String> features, double price) {

        this.name = name;
        this.brand = brand;
        this.gears = gears;
        this.manufactureDate = manufacturedate;
        this.features = features;
        this.price = price;

    }

    // Method - NO PARAMETER AND NO RETURN TYPE

    public void carInfo() {

        System.out.println("Name of car: " + this.name);
        System.out.println("Brand of car: " + this.brand);
        System.out.println("Number of gears in car: " + this.gears);
        System.out.println("Car manufacture date: " + this.manufactureDate);

        // For each Loop
        for (String feature : this.features) {

            System.out.println("Feature of car: " + feature);
        }

        System.out.println("Price of car: " + this.price);

    }
}
