// StringBuffer are mutables that means changeable

public class StringBufferWork {
    public static void main(String[] args) {

        // Default Constructor
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity()); // Default size is 16
        sb1.append("Hello World");
        System.out.println(sb1.capacity());
        sb1.append("Working in StringBuffer");
        System.out.println(sb1.capacity()); // if default size is exceed then newsize = (oldSize * 2)+2

        // Contstructor with capacity
        StringBuffer sb2 = new StringBuffer(5);
        System.out.println(sb2.capacity());
        sb2.append("Good job");
        System.out.println(sb2.capacity());

        // Constructor with String and methods
        StringBuffer sb3 = new StringBuffer("Prabesh");

        // Append --> To add text in the end

        System.out.println(sb3.append(" Gupta"));

        // To get the character at specified index
        System.out.println(sb3.charAt(4));

        /*
         * Compares To
         * If 0 = sb3 = sb3
         * + = sb3> sb1
         * - = sb3< sb1
         */
        System.out.println(sb3.compareTo(sb1));

        // Equals --> Check if both are pointing to same address
        StringBuffer sb4 = new StringBuffer("Prabesh Gupta");
        System.out.println(sb4.equals(sb3));
        // Return false as Both objects are pointed to different address evenif there
        // contents are same

        sb4 = sb3.append("Now, returns true as both are pointing to same address");
        System.out.println(sb4.equals(sb3));

        // IndexOf --> gives index of Character
        System.out.println(sb4.indexOf("t"));
        System.out.println(sb4.lastIndexOf("i"));

        // length --> total characters
        System.out.println(sb4.length());

        // Substring --> to get a part of text
        System.out.println(sb4.substring(8, 16));
        System.out.println(sb4.subSequence(8, 16));

        // Delete --> Delete the text
        System.out.println(sb4.delete(13, 16));

        // deleteCharAt --> Delete the character from mentioned index
        System.out.println(sb4.deleteCharAt(13));

        // Insert --> insert between text
        sb4.insert(51, "the ");
        System.out.println(sb4);

        // Replace --> replace with new text
        System.out.println(sb4.replace(0, 13, ".equals"));

        // setCharAt --> replace character
        System.out.println(sb4.lastIndexOf("p"));
        sb4.setCharAt(33, 'j');
        System.out.println(sb4);

        // ensureCapacity --> set min capacity
        StringBuffer sb5 = new StringBuffer();
        sb5.ensureCapacity(50);
        sb5.append("You are right");

        // trimToSize --> Delete unused memory space
        sb5.trimToSize();
        System.out.println(sb5.capacity());

        // setLength

        StringBuffer sb6 = new StringBuffer("Fire in the jungle");
        sb6.setLength(10);
        System.out.println(sb6);

        // Reverse
        System.out.println(sb5.reverse());

    }
}
