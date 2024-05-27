/*

Create a class named Car that lists all the features, attributes of car like name, brand, gears, manufactured date, features

The features should be of ArrayList datatype. You are free to choose the other data types and variables of the car as you wish. The class should also contain a method to display the attributes of the class.

Then, create a class named Showroom which has its name, address, opening and closing time and a list of cars available there. The class should also contain a method to display.

Finally, create a Program class that has a main method which creates the object of the car and showroom classes and display their details.

Note: Use for each loop while printing details from an arraylist.

 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Car

        ArrayList<String> features = new ArrayList<String>();

        features.add("Auto Braking system");
        features.add("4 Seaters");
        features.add("360-degree camera system");

        Car c1 = new Car("i10", "Hundai", 7, "2014", features, 2000000);

        features.clear();

        features.add("Sun roof");
        features.add("Electic power");
        features.add("Parking cameras");
        features.add("Auto vehicle driving");

        Car c2 = new Car("Telsa Model S", "Tesla", 8, "2018", features, 4000000);

        features.clear();

        features.add("Bulletproof design");
        features.add("Keyless entry");
        features.add("Remote Start");
        features.add("Auto braking system");
        features.add("Window Dimming");

        Car c3 = new Car("Ghost", "Rolls-Royce", 11, "2017", features, 25000000);

        // Showroom

        ArrayList<Car> carsAvailable = new ArrayList<Car>();

        carsAvailable.add(c1);
        carsAvailable.add(c2);

        Showroom showroom1 = new Showroom("Texan Auto-mobiles pvt. ltd.", "Anamnagar", "9851012345", "6am", "6pm",
                carsAvailable);

        showroom1.showroomInfo();

        carsAvailable.clear();
        System.out.println();

        carsAvailable.add(c3);

        Showroom showroom2 = new Showroom("Rolls-Royce Motorcars", "Singha Durbar", "01-4444135", "8am", "4pm",
                carsAvailable);

        showroom2.showroomInfo();

    }
}
