import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiUserInput {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("User Input");
        jFrame.setSize(600, 500);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(5, 2));
        jPanel.setBackground(Color.GREEN);

        JLabel lblFirst = new JLabel("1");
        JLabel lblSecond = new JLabel("2");
        JLabel lblThree = new JLabel("3");
        JLabel lblFour = new JLabel("4");
        JTextField jTextField = new JTextField(5);
        jTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jTextField.getText();

            }
        });

        JButton btnFirst = new JButton("First click");
        btnFirst.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                jTextField.setText("Argentina");

            }
        });

        JButton btnSecond = new JButton("Second Click");
        btnSecond.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jTextField.setText("France");
            }
        });

        JButton btnThree = new JButton("Clear");
        btnThree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jTextField.setText("");
            }
        });
        JButton btnFour = new JButton("Submit");
        btnFour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(jTextField.getText());
            }
        });
        jPanel.add(lblFirst);
        jPanel.add(lblSecond);
        jPanel.add(btnFirst);
        jPanel.add(btnSecond);
        jPanel.add(lblThree);
        jPanel.add(lblFour);
        jPanel.add(btnThree);
        jPanel.add(btnFour);
        jPanel.add(jTextField);

        jFrame.pack();
        jFrame.add(jPanel);
        jFrame.setVisible(true);

    }
}
