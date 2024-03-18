public class MethodOverriding extends Person {

    public String country;

    public MethodOverriding(String name, int age, String address, String number, String country) {
        super(name, age, address, number);
        this.country = country;

    }

    @Override
    public void display() {

        super.display();
        System.out.println("Country is " + country);
    }
}
