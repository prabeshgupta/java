public class JuniorDeveloper extends Developer {

    // Attributes with access specifier as private

    private double salary;
    private String appointedDate;
    private String evaluationPeriod;
    private String terminationDate;
    private String specialization;
    private String appointedBy;
    private boolean joined;

    // Parameterized Constructor

    public JuniorDeveloper(String platform, String interviewerName, int workingHours, double salary, String appointedBy,
            String terminationDate) {
        super(platform, interviewerName, workingHours);

        this.salary = salary;
        this.appointedBy = appointedBy;
        this.terminationDate = terminationDate;
        this.appointedDate = "";
        this.evaluationPeriod = "";
        this.specialization = "";
        this.joined = false;
    }

    // Getter Methods

    public double getSalary() {
        return salary;
    }

    public String getAppointedDate() {
        return appointedDate;
    }

    public String getEvaluationPeriod() {
        return evaluationPeriod;
    }

    public String getTerminationDate() {
        return terminationDate;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getAppointedBy() {
        return appointedBy;
    }

    public boolean getJoined() {
        return joined;
    }

    // Setter Method

    public void setSalary(double salary) {
        if (joined == false) {
            this.salary = salary;
        } else {
            System.out.println("Not possible to change the salary.");
        }
    }

    // Method for appoint developer

    public void appointDeveloper(String developerName, String appointedDate, String terminationDate,
            String specialization) {
        if (joined == false) {
            super.setDeveloperName(developerName);
            joined = true;

        } else {
            System.out.println("Developer is already appointed in " + appointedDate);
        }
        this.terminationDate = terminationDate;
        this.specialization = specialization;
        this.appointedDate = appointedDate;
    }

    // Method to display
    // @override

    public void display() {
        super.display();

        if (joined == true) {
            System.out.println("Appointed Date is " + appointedDate);
            System.out.println("Developer name is " + super.getDeveloperName());
            System.out.println("Evalutaion period is " + evaluationPeriod);
            System.out.println("Termination date is " + terminationDate);
            System.out.println("Salary is " + salary);
            System.out.println("Developer specialization is" + specialization);
            System.out.println("Appointed by " + appointedBy);
        }
    }
}
