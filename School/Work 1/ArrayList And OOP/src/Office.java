import java.util.ArrayList;

public class Office {
    // Properties of office

    public String name;
    public String establishedDate;
    public String openingTime;
    public String closingTime;
    public ArrayList<Staff> activeStaffs;

    // Parameterized Constructor

    Office(String name, String establishedDate, String openingTime, String closingTime, ArrayList<Staff> activeStaffs) {

        this.name = name;
        this.establishedDate = establishedDate;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.activeStaffs = activeStaffs;

    }

    // Method - No parameter and no return type

    public void officeInfo() {
        System.out.println("Name of office: " + this.name);
        System.out.println("Established Date: " + this.establishedDate);
        System.out.println("Opening Time: " + this.openingTime);
        System.out.println("Closing Time: " + this.closingTime);

        // For each loop
        for (Staff activeStaff : activeStaffs) {
            activeStaff.staffInfo();
        }
    }

}
