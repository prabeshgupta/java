public class InheritanceWork {

    public static void main(String[] args) {
        Student s1 = new Student(156);
        s1.name = "Prabesh Gupta";
        s1.age = 20;
        s1.gender = "Male";
        s1.address = "Pepsicola";
        s1.weight = 75;

        s1.info();
        System.out.println();

        Teacher t1 = new Teacher(170);
        t1.name = "Bishoraj Poudel";
        t1.age = 27;
        t1.gender = "Male";
        t1.address = "Pokhara";
        t1.weight = 65;
        t1.subject = "Programming";
        t1.wage = 150000;

        t1.infoNew();
    }

}
