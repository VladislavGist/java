//package extend;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class TwoBtns {
//    JFrame frame;
//    JLabel label;
//    JCheckBox checkBox;
//
//    public void go() {
//        frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JButton labelBtn = new JButton("Change label");
//        labelBtn.addActionListener(new LabelListener());
//
//        JButton colorBtn = new JButton("Change circle");
//        colorBtn.addActionListener(new ColorListener());
//
//        label = new JLabel("I am a label");
//        MyDrawPanel2 drawPanel = new MyDrawPanel2();
//
//        JCheckBox checkBoxBtn = new JCheckBox();
//        checkBoxBtn.addActionListener(new CheckBoxListener());
//
//        frame.getContentPane().add(BorderLayout.SOUTH, colorBtn);
//        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
//        frame.getContentPane().add(BorderLayout.EAST, labelBtn);
//        frame.getContentPane().add(BorderLayout.WEST, label);
//        frame.getContentPane().add(BorderLayout.NORTH, checkBox);
//
//        frame.setSize(600, 300);
//        frame.setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        TwoBtns gui = new TwoBtns();
//        gui.go();
//    }
//
//    class LabelListener implements ActionListener {
//        public void actionPerformed(ActionEvent event) {
//            label.setText("Ouch");
//        }
//    }
//
//    class ColorListener implements ActionListener {
//        public void actionPerformed(ActionEvent event) {
//            frame.repaint();
//        }
//    }
//
//    class CheckBoxListener implements ActionListener {
//        public void actionPerformed(ActionEvent event) {
//            System.out.println("Hello");
//        }
//    }
//}
