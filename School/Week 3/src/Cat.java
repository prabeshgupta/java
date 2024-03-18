public class Cat extends Mammal {

    private String sound;

    // Constructor

    Cat(String name, int age, double height, double weight, String color, String sound) {
        super(name, age, height, weight, color);
        this.sound = sound;
    }

    // Getter

    public String getSound() {
        return sound;
    }

    // Setter

    public void setSound(String sound) {
        this.sound = sound;
    }

    // Method
    public void printDetails() {
        super.printDetails();

        System.out.println("Sound: " + sound);
    }

}
