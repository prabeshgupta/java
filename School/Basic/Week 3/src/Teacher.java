public class Teacher extends Person {

    public String subject;
    public double wage;

    Teacher(double height) {
        super(height);
    }

    public void infoNew() {
        info();
        System.out.println("Suject: " + subject);
        System.out.println("Wage: " + wage);
    }
}
