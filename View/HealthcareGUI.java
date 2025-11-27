package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HealthcareGUI extends JFrame {
    private final JTextField exampleField = new JTextField();
    private final JButton exampleButton = new JButton("Submit");

    public HealthcareGUI() {
        super("Healthcare System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(BorderLayout.NORTH, createMenu());

        setSize(300, 300);
        setVisible(true);
    }

    private JPanel createMenu() {
        JPanel setPanel = new JPanel(new BorderLayout());
        JPanel panel = new JPanel(new GridLayout(3, 2));

        panel.add(new Label("Enter ID: "));
        panel.add(exampleField);
        panel.add(exampleButton);


        setPanel.add(BorderLayout.CENTER, panel);
        return setPanel;
    }

    public String getText() {
        return exampleField.getText();
    }

    public void addSetListener(ActionListener al) {
        exampleButton.addActionListener(al); // Allow controller to get information
    }
}
