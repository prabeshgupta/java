public class Mammal {
    // Properties

    private String name;
    private int age;
    private double height;
    private double weight;
    private String color;

    // Constructor

    Mammal(String name, int age, double height, double weight, String color) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.color = color;

    }

    // Getter

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    // Setter

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;

    }

    // Method

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
    }

}
