import java.io.*;
import java.util.*;

public class Main {

    // Location of text file
    static final String PATH = "BookList.txt";

    // Generic ArrayList
    static ArrayList<Book> books = new ArrayList<>();

    // Object of class Scanner
    static Scanner sc = new Scanner(System.in);

    static boolean status = false;

    public static void main(String[] args) {

        try {

            // Object of class Filereader and BufferReader
            FileReader fileReader = new FileReader(PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            Iterator<String> iterator = bufferedReader.lines().iterator();

            while (iterator.hasNext()) {

                // Storing splited data in array
                String arr[] = iterator.next().split(",");

                // Deserialized means converting byte stream into objects
                // File ko data bata object create garney

                // Object of class Book with parameterized constructor
                Book book = new Book(Integer.parseInt(arr[0].trim()), arr[1].trim(), arr[2].trim(),
                        Integer.parseInt(arr[3].trim()));

                books.add(book);

            }

            fileReader.close();
            bufferedReader.close();

            while (status != true) {
                bookList();

                // To take input from user
                System.out.print("\nChoose option\n1 Borrow Book\n2 Return Book\n0 Exit\n-> ");

                int option = sc.nextInt();
                userOption(option);

            }
            sc.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public static void bookList() {
        System.out.printf("%-5s | %-25s | %-25s | %-5s\n", "ID", "Book Name", "Author", "Quantity");

        // For each loop to display books
        for (Book book : books) {
            book.display();
        }
    }

    public static void userOption(int option) {

        // Operations on user action
        switch (option) {
            case 1:
                borrowBook();
                break;
            case 2:
                returnBook();
                break;
            case 0:
                status = false;
                updateFile();
                break;
            default:
                System.out.println("Enter valid option");
        }

    }

    public static void borrowBook() {

        System.out.print("Enter book id : ");
        int id = sc.nextInt();

        try {

            for (Book book : books) {
                if (book.getId() == id) {

                    if (book.quantityDown()) {
                        System.out.println("Book borrowed");
                    }
                    // break exit switch and loops
                    // return exit whole method
                    return;
                }

            }
            System.out.println("Invalid book id");

        } catch (Exception e) {
            System.out.println("Enter valid book id");
        }
    }

    public static void returnBook() {
        System.out.print("Enter book id : ");
        int id = sc.nextInt();

        try {

            for (Book book : books) {
                if (book.getId() == id) {
                    book.quantityUp();
                    System.out.println("Book returned");
                    return;
                }

            }
            System.out.println("Invalid book id");

        } catch (Exception e) {
            System.out.println("Enter valid book id");
        }
    }

    public static void updateFile() {

        // Serializtion means converting object into byte stream
        // Object ko data haru file ma convert garnu

        try {

            FileWriter fileWriter = new FileWriter(PATH);

            for (Book book : books) {
                fileWriter.write(book.toString());
            }

            System.out.println("File updated successfully");

            fileWriter.close();

        } catch (Exception e) {
            System.out.println("File not updated");
        }

    }
}
