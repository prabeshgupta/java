public class Book {

    // Access modifiers as private
    private int id;
    private String name;
    private String author;
    private int quantity;

    // Getter method for id
    public int getId() {
        return id;
    }

    // Method increase quantity
    public void quantityUp() {
        quantity++;
    }

    // Method decrease quantity
    public boolean quantityDown() {

        if (quantity >= 1) {
            quantity--;
            return true;
        } else {
            System.out.println("Book is not available currently.");
            return false;
        }

    }

    // Parameterized Constructor
    Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    // No parameter and no return type method
    public void display() {
        System.out.printf("%-5s | %-25s | %-25s | %-5s\n", this.id, this.name, this.author, this.quantity);

    }

    @Override
    public String toString() {

        return id + "," + name + "," + author + "," + quantity + "\n";

    }

}
