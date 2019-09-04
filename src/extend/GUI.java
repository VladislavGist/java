package extend;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class GUI implements ActionListener {
    public void start() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click");
        JCheckBox checkBox = new JCheckBox();
        JTextArea txtArea = new JTextArea();

        frame.getContentPane().add(BorderLayout.WEST, button);
        frame.getContentPane().add(BorderLayout.NORTH, checkBox);
        frame.getContentPane().add(BorderLayout.SOUTH, txtArea);

        button.addActionListener(this);

        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(e);
    }

    public static void main(String[] args) {
        GUI gui = new GUI();

        gui.start();
    }
}
