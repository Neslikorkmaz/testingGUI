package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {

    private JFrame frame;

    public MyPanel(JFrame frame) {
        this.frame = frame;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setAlignmentX(Component.CENTER_ALIGNMENT);


        JLabel label = new JLabel("Welcome, please choose your operation", SwingConstants.CENTER);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        add(label);


        JButton v_adding = new JButton("Vehicle adding");
        v_adding.setMaximumSize(new Dimension(200, 40));
        add(v_adding);

        JButton v_exiting = new JButton("Vehicle exiting");
        v_exiting.setMaximumSize(new Dimension(200, 40));
        add(v_exiting);


        JPanel addingPanel = createAddingPanel();
        JPanel exitingPanel = createExitingPanel();


        v_adding.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchPanel(addingPanel);
            }
        });


        v_exiting.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchPanel(exitingPanel);
            }
        });
    }


    private void switchPanel(JPanel newPanel) {
        frame.getContentPane().removeAll();
        frame.add(newPanel);
        frame.revalidate();
        frame.repaint();
    }


    private JPanel createAddingPanel() {
        JPanel addingPanel = new JPanel(new BorderLayout());

        JLabel addingLabel = new JLabel("Vehicle Adding Panel", SwingConstants.CENTER);
        addingPanel.add(addingLabel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));

        JPanel platePanel = new JPanel(new FlowLayout());
        JLabel plateLabel = new JLabel("Enter Plate:");
        JTextField palet = new JTextField(15);
        platePanel.add(plateLabel);
        platePanel.add(palet);


        JLabel label1 = new JLabel("Burada kullanıcı boş slotları görebilecek, istediği yere park edebilecek.");
        label1.setAlignmentX(Component.CENTER_ALIGNMENT);

        centerPanel.add(platePanel);
        centerPanel.add(Box.createVerticalStrut(10));
        centerPanel.add(label1);

        addingPanel.add(centerPanel, BorderLayout.CENTER);


        JButton backButton = new JButton("Back to Menu");
        addingPanel.add(backButton, BorderLayout.SOUTH);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchPanel(MyPanel.this);
            }
        });

        return addingPanel;
    }




    private JPanel createExitingPanel() {
        JPanel exitingPanel = new JPanel(new BorderLayout());

        JLabel exitingLabel = new JLabel("Vehicle Exiting Panel", SwingConstants.CENTER);
        exitingPanel.add(exitingLabel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));

        JPanel platePanel = new JPanel(new FlowLayout());
        JLabel plateLabel = new JLabel("Enter Plate to Exit:");
        JTextField plateField = new JTextField(15);
        platePanel.add(plateLabel);
        platePanel.add(plateField);

        JLabel label1 = new JLabel("Burada kullanıcı plakasını girerek aracını çıkarabilir.");
        label1.setAlignmentX(Component.CENTER_ALIGNMENT);


        centerPanel.add(platePanel);
        centerPanel.add(Box.createVerticalStrut(10));
        centerPanel.add(label1);

        exitingPanel.add(centerPanel, BorderLayout.CENTER);

        JButton backButton = new JButton("Back to Menu");
        exitingPanel.add(backButton, BorderLayout.SOUTH);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchPanel(MyPanel.this);
            }
        });

        return exitingPanel;
    }


}
