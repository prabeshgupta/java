import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class SwingBasicApp {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Swing Basic App");
        jFrame.setSize(400, 600);
        jFrame.setLocation(100, 200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();

        JTextField jTextField = new JTextField();
        jTextField.setText("Name");
        jTextField.setColumns(10);
        jTextField.setEditable(true);
        jTextField.setHorizontalAlignment(JTextField.CENTER);

        JPasswordField jPasswordField = new JPasswordField();
        jPasswordField.setText("Practice");
        jPasswordField.setColumns(12);
        jPasswordField.setHorizontalAlignment(JPasswordField.CENTER);

        JButton jButton = new JButton();
        jButton.setText("Submit");
        jButton.setEnabled(true);

        JCheckBox jCheckBox = new JCheckBox();
        jCheckBox.setSelected(false);
        jCheckBox.setText("Boy");
        jCheckBox.setEnabled(true);

        String[] fruits = { "Apple", "Banana", "Mango", "Guava", "Water Melon" };
        JComboBox<String> jComboBox = new JComboBox<>(fruits);
        jComboBox.addItem("Grapes");
        jComboBox.removeItem("Apple");
        jComboBox.setEnabled(false);

        JList<String> jList = new JList<>();
        jList.setListData(fruits);

        jPanel.add(jTextField);
        jPanel.add(jPasswordField);
        jPanel.add(jButton);
        jPanel.add(jCheckBox);
        jPanel.add(jComboBox);
        jPanel.add(jList);

        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }
}