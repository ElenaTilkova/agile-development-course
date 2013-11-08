package ru.unn.agile.Triangle.view;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: toshiba
 * Date: 06.11.13
 * Time: 20:23
 * To change this template use File | Settings | File Templates.
 */
public class Triangle {
    private JPanel mainPanel;
    private JTextField txtPointA1;
    private JTextField txtPointA2;
    private JTextField txtPointB1;
    private JTextField txtPointB2;
    private JTextField txtPointC1;
    private JTextField txtPointC2;
    private JLabel lbStatus;
    private JTextField txtResult;
    private JButton btnCalc;
    private JComboBox cbOperation;
    private JLabel lblPointA;
    private JLabel lblPointB;
    private JLabel lblPointC;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Triangle");
        frame.setContentPane(new Triangle().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
