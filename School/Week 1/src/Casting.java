// Casting - forcefully changing datatype

public class Casting {
    public static void main(String[] args) {

        // STRING TO INTEGER
        String pin = "1846";

        int pin1 = Integer.parseInt(pin);

        System.out.println(pin1);

        // INTEGER TO STRING 1

        int age = 5;

        String sAge = "" + age;
        System.out.println(sAge);

        // DOUBLE TO STRING 2

        double num = 1.3334;
        String sNum = String.valueOf(num);
        System.out.println(sNum);

        // FLOAT TO STRING

        float weight = 10.2f;
        String sWeight = Float.toString(weight);
        System.out.println(sWeight);
    }
}
