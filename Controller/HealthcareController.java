package Controller;

import java.awt.event.*;
import java.util.ArrayList;
import View.*;
import Model.*;

import javax.swing.*;

public class HealthcareController {
    private final HealthcareGUI view;
    private final HealthcareSystem model;




    public HealthcareController(HealthcareGUI view, HealthcareSystem model) {
        this.view = view;
        this.model = model;
        loadTables();

        view.addSetListener(new SetListener());
    }
    private void loadTables(){
    view.refreshStaffTable(model.getAllStaffMembers());


    }

private class SetListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Showing Text: " + view.getText());
        }
    }
}
