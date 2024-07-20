import java.util.List;
import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class RegistrationController {

    public RegistrationController(RegistrationModel model, RegistrationView view)
            throws ClassNotFoundException, SQLException {
        // Display Table when program runs.
        displayTable();

        view.txtAge.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE
                        || c == KeyEvent.VK_DELETE)) {
                    e.consume();
                }
            }
        });

        view.btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.txtName.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(view.frmMain, "Cannot save empty name.",
                            "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    try {
                        RegistrationModel.saveRegistration(view.txtName.getText().trim(),
                                view.rdoFemale.isSelected() ? "Female"
                                        : view.rdoMale.isSelected() ? "Male" : "Others",
                                Integer.parseInt(view.txtAge.getText()), view.txtAddress.getText().trim(),
                                view.chkStudent.isSelected());
                        JOptionPane.showMessageDialog(view.frmMain, "Record added in Database", "Sucess",
                                JOptionPane.INFORMATION_MESSAGE);

                        // Display Updated Table
                        displayTable();
                    } catch (NumberFormatException e1) {
                        e1.printStackTrace();
                    } catch (ClassNotFoundException e1) {
                        e1.printStackTrace();
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    }

                    view.txtName.setText("");
                    view.txtAge.setText("");
                    view.txtAddress.setText("");
                    view.rdoFemale.setSelected(true);
                    view.chkStudent.setSelected(false);
                }
            }
        });

        view.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.txtName.setText("");
                view.txtAge.setText("");
                view.txtAddress.setText("");
                view.rdoFemale.setSelected(true);
                view.chkStudent.setSelected(false);
            }

        });
    }

    public void displayTable() throws ClassNotFoundException, SQLException {
        List<Object[]> registeredData = RegistrationModel.displayRegistration();
        DefaultTableModel defaultTableModel = (DefaultTableModel) RegistrationView.tblData.getModel();
        defaultTableModel.setRowCount(0); // Clear previous data
        try {
            for (Object[] row : registeredData) {
                defaultTableModel.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
