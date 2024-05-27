import java.util.ArrayList;

public class Showroom {

    // Properties of Showroom

    public String name;
    public String address;
    public String contactNo;
    public String openingTime;
    public String closingTime;
    public ArrayList<Car> carsAvailable;

    // Parameterized Constructor

    Showroom(String name, String address, String contactNo, String openingTime, String closingTime,
            ArrayList<Car> carsAvailable) {

        this.name = name;
        this.address = address;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.carsAvailable = carsAvailable;
        this.contactNo = contactNo;

    }

    // Method - NO PARAMETER AND NO RETURN TYPE

    public void showroomInfo() {

        System.out.println("The Showroom name: " + this.name);
        System.out.println("The Showroom address: " + this.address);
        System.out.println("Contact number: " + this.contactNo);
        System.out.println("Opening Time: " + this.openingTime);
        System.out.println("Closing Time: " + this.closingTime);
        System.out.println();
        System.out.println("Cars Available in Showroom");
        // For each loop

        for (Car carAvailable : carsAvailable) {

            carAvailable.carInfo();
        }
    }

}
