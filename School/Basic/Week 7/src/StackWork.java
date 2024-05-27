import java.util.Stack;

public class StackWork {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.add(4);
        stack.add(9);

        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
