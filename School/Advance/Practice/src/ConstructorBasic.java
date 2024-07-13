public class ConstructorBasic {

    public ConstructorBasic(String param) {
        System.out.println(param);
    }

    public static void main(String[] args) {
        new ConstructorBasic("Constructor worked");
    }
}