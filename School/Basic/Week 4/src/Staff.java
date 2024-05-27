public class Staff extends NewPerson {

    private String experience;

    Staff(double salary, String address, String experience) {
        super(salary, address);
        this.experience = experience;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void enterDetails(String name, int age) {
        super.setName(name);
        super.setAge(age);
    }

    public void display() {
        super.display();
        System.out.println("Experience: " + experience);
    }

}
