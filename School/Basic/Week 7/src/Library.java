import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class Library {

    static final String FILEPATH = "C:\\Users\\gamer\\Documents\\Coding\\Classroom\\Week 7\\src\\Books.txt";

    public static void main(String[] args) {

        try {
            FileReader fReader = new FileReader(FILEPATH);
            BufferedReader bReader = new BufferedReader(fReader);

            // String line = bReader.readLine();

            // if (line != null) {
            // System.out.println(line);
            // } else {
            // System.out.println("File not found");
            // }

            // Iterator - checks if there's new data in the array
            // hasNext() - checks if there's new data in the array and returns boolean value
            // next() - checks new data and returns the String value

            // POJO Plain Old Java Objects

            ArrayList<Book> books = new ArrayList<>();

            Iterator<String> lines = bReader.lines().iterator();

            while (lines.hasNext()) {

                String[] arr = lines.next().split(",");

                Book book = new Book(Integer.parseInt(arr[0]), arr[1], arr[2], Integer.valueOf(arr[3].trim()));

                books.add(book);

            }

            for (Book book : books) {
                book.display();
            }

            fReader.close();
            bReader.close();

            fileWriter(books);

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public static void fileWriter(ArrayList<Book> books) {

        try {

            FileWriter fWriter = new FileWriter(FILEPATH);

            for (Book book : books) {
                fWriter.write(book.toString());
            }
            System.out.println("File written successfully");

            fWriter.close();

        } catch (Exception e) {
            System.out.println(e.toString());

        }

    }
}
