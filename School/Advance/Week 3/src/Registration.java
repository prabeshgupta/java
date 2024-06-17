import javax.swing.*;
import javax.swing.table.DefaultTableModel;

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
    DefaultTableModel defaultTableModel;
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

        // CheckBox
        chkStudent = new JCheckBox("Student");
        chkStudent.setPreferredSize(dimLbl);

        // Table
        headers = new String[] { "Name", "isStudent", "Gender", "Age", "Address" };

        tData = new Object[][] {
                { "Prabesh", true, "Male", 22, "Kathmandu" },
                { "Upahar", true, "Female", 21, "Ontario" },
                { "John", false, "Male", 44, "New York" },
                { "Prabesh", true, "Male", 22, "Kathmandu" },
                { "Upahar", true, "Female", 21, "Ontario" },
                { "John", false, "Male", 44, "New York" },
                { "Prabesh", true, "Male", 22, "Kathmandu" },
                { "Upahar", true, "Female", 21, "Ontario" },
                { "John", false, "Male", 44, "New York" },
        };

        defaultTableModel = new DefaultTableModel(tData, headers);
        jTable = new JTable(defaultTableModel);

        // Add JTable to JScrollPane
        jScrollPane = new JScrollPane(jTable);
        jScrollPane.setPreferredSize(new Dimension(425, 150));
        jTable.setFillsViewportHeight(true);

        // Button
        btnSave = new JButton("Save");
        btnReset = new JButton("Reset");

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
        pnlMain.add(jScrollPane);
        pnlMain.add(btnSave);
        pnlMain.add(btnReset);

        fraMain.add(pnlMain);
        fraMain.setVisible(true);
    }

    public static void main(String[] args) {
        new Registration();
    }
}
