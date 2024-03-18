import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GuiForm {

    private static JLabel lblWelcome;
    private static JLabel lblName;
    private static JLabel lblAge;
    private static JLabel lblAddress;
    private static JLabel lblNumber;
    private static JLabel lblLanguage;
    private static JLabel lblGender;
    private static JLabel lblCountry;
    private static JTextField txtName;
    private static JTextField txtAge;
    private static JTextField txtAddress;
    private static JTextField txtNumber;
    private static JCheckBox boxNepali;
    private static JCheckBox boxEnglish;
    private static JCheckBox boxHindi;
    private static JRadioButton rbtnMale;
    private static JRadioButton rbtnFemale;
    private static JComboBox<String> boxCountry;
    private static ButtonGroup btnGroup;

    private static JButton btnSubmit;
    private static JButton btnClear;

    public static void main(String[] args) {

        // JFrame
        JFrame jFrame = new JFrame();
        // Second way of setting title, first way is directly passing argument
        jFrame.setTitle("Prabesh Gupta");
        // Frame resolution
        jFrame.setSize(600, 400);
        // Needs to be closed
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();
        // If can only use setBounds if setLayout is null
        jPanel.setLayout(null);

        lblWelcome = new JLabel();
        lblWelcome.setText("Register Account");
        // Decoration
        lblWelcome.setFont(new Font("Serif", Font.BOLD, 20));
        lblWelcome.setForeground(Color.BLUE);
        lblWelcome.setBounds(220, 10, 250, 20);

        // For next element always take greater value than previous y + height
        lblName = new JLabel("Full Name");
        lblName.setBounds(20, 40, 60, 20);

        txtName = new JTextField();
        txtName.setBounds(20, 60, 160, 30);

        lblAge = new JLabel("Age");
        lblAge.setBounds(400, 40, 60, 20);

        txtAge = new JTextField();
        txtAge.setBounds(400, 60, 160, 30);

        lblAddress = new JLabel("Address");
        lblAddress.setBounds(20, 100, 120, 20);

        txtAddress = new JTextField();
        txtAddress.setBounds(20, 120, 160, 30);

        lblNumber = new JLabel("Phone Number");
        lblNumber.setBounds(400, 100, 120, 20);

        // Checkbox
        txtNumber = new JTextField();
        txtNumber.setBounds(400, 120, 160, 30);

        lblLanguage = new JLabel("Language");
        lblLanguage.setBounds(20, 190, 150, 20);

        boxNepali = new JCheckBox("Nepali");
        boxNepali.setBounds(90, 190, 110, 20);

        boxEnglish = new JCheckBox("English");
        boxEnglish.setBounds(180, 190, 110, 20);

        boxHindi = new JCheckBox("Hindi");
        boxHindi.setBounds(290, 190, 110, 20);

        // Radio Buttons
        lblGender = new JLabel("Gender");
        lblGender.setBounds(20, 230, 90, 20);

        rbtnMale = new JRadioButton("Male", true);
        rbtnMale.setBounds(90, 230, 90, 20);

        rbtnFemale = new JRadioButton("Female");
        rbtnFemale.setBounds(180, 230, 90, 20);

        // To select one radio at a time
        btnGroup = new ButtonGroup();
        btnGroup.add(rbtnMale);
        btnGroup.add(rbtnFemale);

        lblCountry = new JLabel("Country");
        lblCountry.setBounds(20, 270, 90, 20);

        // Select from multiple options
        boxCountry = new JComboBox<String>();
        boxCountry.addItem("Nepal");
        boxCountry.addItem("India");
        boxCountry.addItem("USA");
        boxCountry.addItem("UK");
        boxCountry.addItem("France");
        boxCountry.setBounds(90, 270, 100, 20);

        btnSubmit = new JButton("Register");
        btnSubmit.setBounds(170, 320, 100, 30);
        btnSubmit.setBackground(Color.ORANGE);
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                User user = new User(txtName.getText(), Integer.parseInt(txtAge.getText()), txtAddress.getText(),
                        txtNumber.getText());
                user.display();
                clearTxt();
            }
        });

        btnClear = new JButton("Clear");
        btnClear.setBounds(300, 320, 100, 30);
        btnClear.setBackground(Color.YELLOW);
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearTxt();
            }
        });

        // Adding components to jPanel
        jPanel.add(lblWelcome);
        jPanel.add(lblName);
        jPanel.add(txtName);
        jPanel.add(lblAge);
        jPanel.add(txtAge);
        jPanel.add(lblAddress);
        jPanel.add(txtAddress);
        jPanel.add(lblNumber);
        jPanel.add(txtNumber);
        jPanel.add(btnSubmit);
        jPanel.add(btnClear);
        jPanel.add(lblLanguage);
        jPanel.add(boxEnglish);
        jPanel.add(boxHindi);
        jPanel.add(boxNepali);
        jPanel.add(lblGender);
        jPanel.add(rbtnMale);
        jPanel.add(rbtnFemale);
        jPanel.add(lblCountry);
        jPanel.add(boxCountry);

        jFrame.add(jPanel);
        // To show java console
        jFrame.setVisible(true);
    }

    public static void clearTxt() {
        txtName.setText("");
        txtAge.setText("");
        txtAddress.setText("");
        txtNumber.setText("");
    }

}
