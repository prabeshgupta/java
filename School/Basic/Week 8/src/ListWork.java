import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

public class ListWork {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        HashSet<String> hashSet = new HashSet<>();

        // List
        list.add("Kathmandu");
        list.add("Tokyo");
        list.add("Rio de jenerio");

        // listWork(list);

        // LinkedList

        linkedList.add("Esewa");
        linkedList.add("Khalti");
        linkedList.add("IME pay");

        // listWork(linkedList);

        // HashSet

        // Comparator --> used for sorting

        hashSet.add("KIA");
        hashSet.add("TATA");
        hashSet.add("BMW");
        hashSet.add("Hyundai");
        hashSet.add("TATA");

        System.out.println(hashSet);

    }

    public static void listWork(List<String> list) {
        System.out.println(list);

    }

}
