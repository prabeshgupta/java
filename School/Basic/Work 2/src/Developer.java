public class Developer {

    // Attributes with access specifier as private

    private String platform;
    private String interviewerName;
    private String developerName;
    private int workingHours;

    // Parameterized Constructor

    public Developer(String platform, String interviewerName, int workingHours) {
        this.platform = platform;
        this.interviewerName = interviewerName;
        this.workingHours = workingHours;
        this.developerName = "";
    }

    // Getter Methods
    public String getPlatform() {
        return platform;
    }

    public String getInterviewerName() {
        return interviewerName;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    // Setter for developerName
    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    // Display Method
    public void display() {
        System.out.println("Platform is " + platform);
        System.out.println("Interviewer name is " + interviewerName);
        System.out.println("Working hours is " + workingHours);

        // Check if developer name is not empty string
        if (developerName != "") {
            System.out.println("Developer name is " + developerName);
        }
    }
}
