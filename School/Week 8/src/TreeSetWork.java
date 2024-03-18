import java.util.TreeSet;

public class TreeSetWork {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(4);
        treeSet.add(13);
        treeSet.add(65);
        treeSet.add(73);
        treeSet.add(13);
        treeSet.add(32);

        System.out.println(treeSet);
    }
}
