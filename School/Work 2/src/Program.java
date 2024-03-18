public class Program {
    public static void main(String[] args) {

        SeniorDeveloper sD = new SeniorDeveloper("iOS", "Pratik Bisunke", 8, 40000, 12);

        System.out.println("Senior Developer: ");
        sD.display();
        System.out.println();

        JuniorDeveloper jD = new JuniorDeveloper("Android", "Gauri Sharma", 10, 19999.99, "Prabesh Gupta",
                "2022/10/20");

        System.out.println("Junior Developer:");
        jD.display();

    }
}
