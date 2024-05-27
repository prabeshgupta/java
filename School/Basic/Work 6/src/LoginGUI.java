import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginGUI extends JFrame implements ActionListener {

    // GUI components
    private JLabel userLabel, passLabel;
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton;

    public LoginGUI() {
        super("Login");

        // Create GUI components
        userLabel = new JLabel("Username: ");
        passLabel = new JLabel("Password: ");
        userField = new JTextField(20);
        passField = new JPasswordField(20);
        loginButton = new JButton("Login");

        // Add action listener to login button
        loginButton.addActionListener(this);

        // Set up layout
        setLayout(new GridLayout(3, 2));
        add(userLabel);
        add(userField);
        add(passLabel);
        add(passField);
        add(loginButton);

        // Set window properties
        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Handle login button click event
    public void actionPerformed(ActionEvent e) {
        String username = userField.getText();
        String password = new String(passField.getPassword());

        // Check if username and password are correct
        if (username.equals("admin") && password.equals("password")) {
            JOptionPane.showMessageDialog(this, "Login successful");
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password");
        }
    }

    public static void main(String[] args) {
        LoginGUI loginGUI = new LoginGUI();
    }
}
