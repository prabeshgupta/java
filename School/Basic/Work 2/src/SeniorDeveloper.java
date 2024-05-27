public class SeniorDeveloper extends Developer {

    // Attributes with access specifier as private

    private double salary;
    private String joiningDate;
    private String staffRoomNumber;
    private int contractPeriod;
    private double advanceSalary;
    private boolean appointed;
    private boolean terminated;

    // Parameterized Constructor

    public SeniorDeveloper(String platform, String interviewerName, int workingHours, double salary,
            int contractPeriod) {
        super(platform, interviewerName, workingHours);
        this.salary = salary;
        this.contractPeriod = contractPeriod;
        this.joiningDate = "";
        this.staffRoomNumber = "";
        this.advanceSalary = 0.0;
        this.appointed = false;
        this.terminated = false;

    }

    // Getter Methods

    public double getSalary() {
        return salary;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public String getStaffRoomNumber() {
        return staffRoomNumber;
    }

    public int getContractPeriod() {
        return contractPeriod;
    }

    public double getAdvanceSalary() {
        return advanceSalary;
    }

    public boolean getAppointed() {
        return appointed;
    }

    public boolean getTerminated() {
        return terminated;
    }

    // Setter Methods

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setContractPeriod(int contractPeriod) {
        this.contractPeriod = contractPeriod;
    }

    // Method for hire developer

    public void hireDeveloper(String developerName, String joiningDate, double advanceSalary, String staffRoomNumber) {

        if (appointed == true) {
            System.out.println(
                    "Developer " + developerName + " is already appointed in staff room number " + staffRoomNumber);
        } else {
            super.setDeveloperName(developerName);
            this.joiningDate = joiningDate;
            this.staffRoomNumber = staffRoomNumber;
            this.advanceSalary = advanceSalary;
            this.appointed = true;
            this.terminated = false;
        }
    }

    // Method for contract termination
    public void contractTerminate() {
        if (terminated == true) {
            System.out.println("Developer is terminated.");
        } else {
            super.setDeveloperName("");
            joiningDate = "";
            advanceSalary = 0.0;
            appointed = false;
            terminated = true;
        }
    }

    // Method for print

    public void print() {
        System.out.println("Platform is " + super.getPlatform());
        System.out.println("Interviewer Name is " + super.getInterviewerName());
        System.out.println("Salary is " + salary);
    }

    // Method to display
    // @override
    public void display() {
        super.display();

        // Check if developer is already appointed
        if (appointed == true) {
            System.out.println("Termination status is " + terminated);
            System.out.println("Joining Date is " + joiningDate);
            System.out.println("Advance Salary is " + advanceSalary);
            System.out.println("Developer name is " + super.getDeveloperName());
        }

    }

}
