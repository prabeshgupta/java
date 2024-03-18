import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPaneShowDialogBox {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        JOptionPane.showMessageDialog(jFrame, "JAVA is best", "Dialog Box ", JOptionPane.ERROR_MESSAGE);

        // Symbols
        for (int i = 0; i <= 3; i++) {
            JOptionPane.showMessageDialog(jFrame, "JAVA is best", "Dialog Box " + i, i);
        }

        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
    }
}
