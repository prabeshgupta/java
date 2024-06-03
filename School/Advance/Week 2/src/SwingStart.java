/*Swing is a set of classes and interfaces provided to design GUI.

1. More components
2. Light weight components
3. Pluggable look and feel
4. MVC architecture
5. Flexible Event handling
6. Robustness
*/

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingStart {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("GUI Mode");

        jFrame.setSize(500, 200);
        jFrame.setLocation(400, 300);

        // Shorthand for setLocation and setSize
        // jFrame.setBounds(200, 200, 500, 400);
        jFrame.setResizable(false);

        JButton jb = new JButton("Click Me");
        // jb.setEnabled(false);

        JTextField jTF = new JTextField();
        jTF.setColumns(10);
        jTF.setText("Null Pointer Variable");
        jTF.setHorizontalAlignment(JTextField.CENTER);
        jTF.setEditable(false);

        // Controlling components
        JPanel jp = new JPanel();
        jp.add(jb);
        jp.add(jTF);

        // JFrame - JPanel - Component architecture
        jFrame.add(jp);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setVisible(true);
    }
}
