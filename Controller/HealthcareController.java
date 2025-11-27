package Controller;

import java.awt.event.*;

import View.*;
import Model.*;

import javax.swing.*;

public class HealthcareController {
    private final HealthcareGUI View;
    private final HealthcareSystem Model;

    public HealthcareController(HealthcareGUI View, HealthcareSystem Model) {
        this.View = View;
        this.Model = Model;

        View.addSetListener(new SetListener());
    }

    private class SetListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Showing Text: " + View.getText());
        }
    }
}
