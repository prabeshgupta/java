public class Person {

    // Access modifiers as private
    private String name;
    private int age;
    private String address;
    private String number;

    // Parameterized Constructor
    public Person(String name, int age, String address, String number) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.number = number;
    }

    public void display() {
        System.out.println("Name is " + this.name);
        System.out.println("Age is " + this.age);
        System.out.println("Address is " + this.address);
        System.out.println("Number is " + this.number);

    }

}
