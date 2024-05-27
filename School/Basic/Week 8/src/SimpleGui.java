import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimpleGui {
    public static void main(String[] args) {

        // Create object of class JFrame
        JFrame jFrame = new JFrame("First GUI Program");

        // To display frame
        jFrame.setVisible(true);

        // Frame size
        jFrame.setSize(800, 600);

        // To close frame
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

        // Create object of class JPanel
        JPanel jPanel = new JPanel();

        // Set panel background color
        jPanel.setBackground(Color.PINK);

        // Create buttons and lables object
        JButton jButton = new JButton("Submit");

        JLabel jLabel = new JLabel("Hello World! Greeting from Prabesh");

        jPanel.add(jButton);
        jPanel.add(jLabel);

        jFrame.add(jPanel);
        jFrame.pack();
    }
}
