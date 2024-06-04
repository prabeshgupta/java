/*
         * Layout manager is a object that controls the size and position of components
         * within a container.
         * 
         * Types:
         * FlowLayout -> left to right arrangement. When one line filled, it starts a
         * new line
         * 
         * BorderLayout -> NORTH, SOUTH, WEST, EAST, CENTER
         * 
         * GridLayout -> Arrangement in rectangular grid. All cells in the grid have
         * the same size.
         * 
         * Box Layout -> Either single row or single column
         * 
         * CardLayout -> Switch between different panels
         */

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class LayoutManagers {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Layout Manager");
        jFrame.setSize(600, 500);
        // Exactly at center
        jFrame.setLocationRelativeTo(null);

        JTextField jTF1 = new JTextField("Username");
        jTF1.setPreferredSize(new Dimension(200, 25));
        JTextField jTF2 = new JTextField("Password");
        jTF2.setPreferredSize(new Dimension(200, 25));

        JButton jBT = new JButton("Submit");
        jBT.setPreferredSize(new Dimension(100, 25));

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        jPanel.add(jTF1);
        jPanel.add(jTF2);
        jPanel.add(jBT);

        // Uncomment both to bring in effect
        // jPanel.setLayout(new BorderLayout());
        // jPanel.add(jBT, BorderLayout.SOUTH);

        jFrame.add(jPanel);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
