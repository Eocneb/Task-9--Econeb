package edu.coe.hughes;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class Main {
    public static final String[][] BUTTON_TEXTS = {
            {"MC", "MR", "MS", "M+", "M-"},
            {"←", "CE", "C", "±", "√"},
            {"7", "8", "9", "/", "%"},
            {"4", "5", "6", "*", "1/x"},
            {"1", "2", "3", "-", "="},
            {"0", ".", "/", "+"}
    };
    public static final Font BTN_FONT = new Font(Font.SANS_SERIF, Font.BOLD, 24);

    private static void createAndShowGui() {
        JTextField field = new JTextField(10);
        field.setFont(BTN_FONT.deriveFont(Font.PLAIN));
        JPanel btnPanel = new JPanel(new GridLayout(BUTTON_TEXTS.length,
                BUTTON_TEXTS[0].length));

        for (int i = 0; i < BUTTON_TEXTS.length; i++) {
            for (int j = 0; j < BUTTON_TEXTS[i].length; j++) {
                JButton btn = new JButton(BUTTON_TEXTS[i][j]);
                btn.setFont(BTN_FONT);
                btnPanel.add(btn);
            }
        }

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(field, BorderLayout.PAGE_START);
        mainPanel.add(btnPanel, BorderLayout.CENTER);


        JFrame frame = new JFrame("Calc2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGui();
            }
        });
    }
}