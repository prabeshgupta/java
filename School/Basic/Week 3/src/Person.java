public class Person {
    public String name;
    public int age;
    public String gender;
    public String address;
    public double height;
    public double weight;

    public Person(double height) {
        this.height = height;
    }

    public void info() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Height: " + this.height);
        System.out.println("Weight: " + weight);
    }

}
