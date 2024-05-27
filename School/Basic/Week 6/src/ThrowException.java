
public class ThrowException {
    public static void main(String[] args) {
        try {
            display();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public static void display() throws Exception {
        System.out.println("Hello master");
        // throw new Exception();

    }
}
