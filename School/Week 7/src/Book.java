public class Book {

    // Properties with access modifier as private
    private int id;
    private String name;
    private String author;
    private int available;

    // Parameterized Constructor
    public Book(int id, String name, String author, int available) {

        this.id = id;
        this.name = name;
        this.author = author;
        this.available = available;
    }

    // display Method
    public void display() {
        System.out.println("Book id: " + this.id);
        System.out.println("Book name: " + this.name);
        System.out.println("Author: " + this.author);
        System.out.println("Available books: " + this.available);

    }

    @Override
    public String toString() {
        return id + "," + name + "," + author + "," + available + "\n";
    }

}
