package com.codeGui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class firstGui {
    private JButton buttonMsg;
    private JPanel panelMain;

    public firstGui() {
        buttonMsg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog( null, "Hello World !");
            }
        });
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Hello World !");
        jFrame.setContentPane(new firstGui().panelMain);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
