import javax.swing.*;
import java.awt.*;

public class Registration {
    JFrame fraMain;
    JLabel lblName, lblGender, lblAge, lblAddress, lblEmpty;
    JCheckBox chkStudent;
    JRadioButton rdoFemale, rdoMale, rdoOthers;
    JTextField txtName, txtAge;
    JTextArea txtAddress;
    JButton btnSave, btnReset;
    JPanel pnlMain, pnlGender;
    JTable jTable;
    JScrollPane jScrollPane; // Add JScrollPane

    Dimension dimFrame = new Dimension(450, 450);
    Dimension dimText = new Dimension(250, 25);
    Dimension dimLbl = new Dimension(150, 25);
    Dimension dimTextArea = new Dimension(250, 50);

    String[] headers;
    Object[][] tData;

    public Registration() {
        fraMain = new JFrame("Registration Form");
        fraMain.setSize(dimFrame);
        fraMain.setLocationRelativeTo(null);
        fraMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fraMain.setResizable(false);

        // Radio Button
        rdoFemale = new JRadioButton("Female", true);
        rdoMale = new JRadioButton("Male");
        rdoOthers = new JRadioButton("Others");

        // Group radio button
        ButtonGroup btnGenderGroup = new ButtonGroup();
        btnGenderGroup.add(rdoFemale);
        btnGenderGroup.add(rdoMale);
        btnGenderGroup.add(rdoOthers);

        pnlGender = new JPanel(true);
        pnlGender.setLayout(new GridLayout(1, 3));
        pnlGender.add(rdoFemale);
        pnlGender.add(rdoMale);
        pnlGender.add(rdoOthers);

        // Label
        lblName = new JLabel("Name");
        lblName.setPreferredSize(dimLbl);
        lblName.setHorizontalAlignment(JLabel.RIGHT);

        lblAge = new JLabel("Age");
        lblAge.setPreferredSize(dimLbl);
        lblAge.setHorizontalAlignment(JLabel.RIGHT);

        lblGender = new JLabel("Gender");
        lblGender.setPreferredSize(dimLbl);
        lblGender.setHorizontalAlignment(JLabel.RIGHT);

        lblAddress = new JLabel("Address");
        lblAddress.setPreferredSize(dimLbl);
        lblAddress.setHorizontalAlignment(JLabel.RIGHT);

        lblEmpty = new JLabel("");
        lblEmpty.setPreferredSize(dimLbl);

        // Text Field
        txtName = new JTextField();
        txtName.setPreferredSize(dimText);

        txtAge = new JTextField();
        txtAge.setPreferredSize(dimText);

        txtAddress = new JTextArea();
        txtAddress.setPreferredSize(dimTextArea);

        // Button
        btnSave = new JButton("Save");
        btnReset = new JButton("Reset");

        // CheckBox
        chkStudent = new JCheckBox("Student");
        chkStudent.setPreferredSize(dimLbl);

        // Table
        headers = new String[] { "Name", "isStudent", "Gender", "Age", "Address" };

        tData = new Object[][] {
                { "Prabesh", true, "Male", "Kathmandu" },
                { "Upahar", true, "Female", "Ontario" },
                { "John", false, "Male", "New York" }
        };

        jTable = new JTable(tData, headers);

        // Add JTable to JScrollPane
        jScrollPane = new JScrollPane(jTable);
        jTable.setFillsViewportHeight(true);

        pnlMain = new JPanel(true);
        pnlMain.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        pnlMain.add(lblName);
        pnlMain.add(txtName);
        pnlMain.add(lblEmpty);
        pnlMain.add(chkStudent);
        pnlMain.add(lblGender);
        pnlMain.add(pnlGender);
        pnlMain.add(lblAge);
        pnlMain.add(txtAge);
        pnlMain.add(lblAddress);
        pnlMain.add(txtAddress);
        pnlMain.add(btnSave);
        pnlMain.add(btnReset);
        pnlMain.add(jScrollPane);

        fraMain.add(pnlMain);
        fraMain.setVisible(true);
    }

    public static void main(String[] args) {
        new Registration();
    }
}
