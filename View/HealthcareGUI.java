package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.awt.SystemColor.infoText;
import static java.awt.SystemColor.text;

public class HealthcareGUI extends JFrame {
    private JTabbedPane tabsPane;
    private final JTextField exampleField = new JTextField();
    private final JButton exampleButton = new JButton("Submit");



    public HealthcareGUI() {
        super("Healthcare System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        setSize(600, 600);
        createTabs();
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
     private void createTabs() {
        tabsPane = new JTabbedPane();
        tabsPane.addTab("Patients", createPatientPanel());
        tabsPane.addTab("Appointments", createAppointmentPanel());
        tabsPane.addTab("Prescriptions", createPerscriptionPanel());
        tabsPane.addTab("Clinicians", createCliniciansPanel());
        tabsPane.addTab("Staff", createStaffPanel());
        tabsPane.addTab("Facilities", createFacilitiesPanel());
        tabsPane.addTab("Referrals", createReferralsPanel());
        add(tabsPane);

     }
     private JPanel createPatientPanel(){
        JPanel panel = new JPanel();
        return panel;
     }
    private JPanel createAppointmentPanel() {
        JPanel panel = new JPanel();
        return panel;
    }

    private JPanel createPerscriptionPanel() {
        JPanel panel = new JPanel();
        return panel;
    }

    private JPanel createCliniciansPanel() {
        JPanel panel = new JPanel();
        return panel;
    }

    private JPanel createStaffPanel() {
        JPanel panel = new JPanel();
        return panel;
    }

    private JPanel createFacilitiesPanel() {
        JPanel panel = new JPanel();
        return panel;
    }
    private JPanel createReferralsPanel() {
        JPanel panel = new JPanel();
        return panel
    }

    public String getText() {
        return exampleField.getText();
    }

    public void addSetListener(ActionListener al) {
        exampleButton.addActionListener(al); // Allow controller to get information
    }
}
