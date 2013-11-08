package ru.unn.agile.ComplexNumber.view;

import ru.unn.agile.ComplexNumber.viewmodel.ViewModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends ViewModel
{
    private JPanel mainPanel;
    private JButton btnCalc;

    // Fields to bind
    private JTextField txtPoinA;
    private JTextField txtPointA;
    private JTextField txtZ2Re;
    private JTextField txtZ2Im;
    private JComboBox cbOperation;
    private JTextField txtResult;
    private JLabel lbStatus;
    private JLabel lblPoinaAFirst;
    private JLabel lblPointASecond;

    public Calculator() {
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcActionHandler.onClick();
            }
        });
    }

    @Override
    public void bind() {
        re1 = txtPoinA.getText();
        im1 = txtPointA.getText();
        re2 = txtZ2Re.getText();
        im2 = txtZ2Im.getText();

        op = ViewModel.Operation.values()[cbOperation.getSelectedIndex()];

        result = txtResult.getText();
        message = lbStatus.getText();
    }

    @Override
    public void unbind() {
        txtPoinA.setText(re1);
        txtPointA.setText(im1);
        txtZ2Re.setText(re2);
        txtZ2Im.setText(im2);

        txtResult.setText(result);
        lbStatus.setText(message);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");

        frame.setContentPane(new Calculator().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
