import java.util.Hashtable;

public class HashTableWork {
    public static void main(String[] args) {
        Hashtable<String, Double> hashTable = new Hashtable<>();

        hashTable.put("Acer Nitro 5", 108000.0);
        hashTable.put("Legion 5", 117000.0);
        hashTable.put("HP pavillion", 950000.0);
        hashTable.put("Asus Tuf Gaming", 110000.0);

        for (String i : hashTable.keySet()) {
            System.out.println("Laptop name is " + i + ". The price is " + Double.valueOf(hashTable.get(i)));
        }

    }
}
