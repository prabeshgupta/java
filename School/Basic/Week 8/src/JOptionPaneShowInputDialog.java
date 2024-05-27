import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPaneShowInputDialog {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        String name = JOptionPane.showInputDialog(jFrame, "Full name");
        int age = Integer.parseInt(JOptionPane.showInputDialog(jFrame, "Age"));

        if (age < 18) {
            JOptionPane.showMessageDialog(jFrame, "You are minor", "Restricted", JOptionPane.ERROR_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(jFrame, "You are eligible", "Allowed", JOptionPane.INFORMATION_MESSAGE);
        }

        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
    }
}
