// Strings are immutable that means once created cannot be modifed or changed in simple words unchangeable 

public class StringImmutable {

    public static void main(String[] args) {
        String name = "Prabesh";

        System.out.println(name.hashCode());

        // Any changes in String will Store in different memory address

        name = name.concat(" Gupta");
        System.out.println(name.hashCode());
    }

}
