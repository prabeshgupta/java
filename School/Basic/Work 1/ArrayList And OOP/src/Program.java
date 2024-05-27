import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        // Staffs

        ArrayList<String> features = new ArrayList<String>();

        features.add("Punctual");
        features.add("Hard working");
        features.add("Leadership");
        features.add("Team work");

        Staff s1 = new Staff("Bimal Sapkota", "Male", 27, 50000, "Pulchowk", features);

        features.clear();

        features.add("Fast typer");
        features.add("Good learner");
        features.add("Good communicator");

        Staff s2 = new Staff("Prapti Dhakal", "Female", 28, 40000, "Banepa", features);

        features.clear();

        features.add("Decision Maker");
        features.add("Smart");
        features.add("Problem solver");

        Staff s3 = new Staff("Amatya Kandel", "Male", 36, 70000, "Thapathali", features);

        // Office
        ArrayList<Staff> activeStaffs = new ArrayList<Staff>();

        activeStaffs.add(s2);
        activeStaffs.add(s3);

        Office o1 = new Office("Sankalpa Manpower", "2056", "10pm", "5pm", activeStaffs);

        o1.officeInfo();

        activeStaffs.clear();

        activeStaffs.add(s1);

        Office o2 = new Office("Vagya Chamkau Pvt. ltd.", "2049", "6pm", "3pm", activeStaffs);

        o2.officeInfo();

    }
}