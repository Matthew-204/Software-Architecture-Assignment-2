package View;

import Controller.HealthcareController;
import Model.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class HealthcareGUI extends JFrame {
    private HealthcareController controller;
    private JTabbedPane tabsPane;
    private final JTextField exampleField = new JTextField();
    private final JButton exampleButton = new JButton("Submit");

    private JTable patientTable;
    private DefaultTableModel patientTableModel;
    private JTable appointmentTable;
    private DefaultTableModel appointmentTableModel;
    private JTable prescriptionTable;
    private DefaultTableModel prescriptionTableModel;
    private JTable cliniciansTable;
    private DefaultTableModel cliniciansTableModel;
    private JTable staffTable;
    private DefaultTableModel staffTableModel;
    private JTable facilitiesTable;
    private DefaultTableModel facilitiesTableModel;
    private JTable referralsTable;
    private DefaultTableModel referralsTableModel;


    public HealthcareGUI() {
        super("Healthcare System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        setSize(600, 600);
        createTabs();
        setVisible(true);


    }
    public void setController(HealthcareController controller){
        this.controller = controller;

    }
////    private void loadData(){
////        loadStaff();
////    }
////    private void loadStaff() {
//
//    }
    public void refreshStaffTable(ArrayList<Staff>listofStaff) {
        staffTableModel.setRowCount(0);
        for (int i = 0; i < listofStaff.size(); i = i + 1) {
            Staff staff = listofStaff.get(i);

            Object[] row = {
                    staff.getID(),
                    staff.getFirstName(),
                    staff.getLastName(),
                    staff.getJob_Role(),
                    staff.getDepartment_Name(),
                    staff.getFacility_ID(),
                    staff.getPhoneNumber(),
                    staff.getEmailAddress(),
                    staff.getEmployment_Status(),
                    staff.getStart_Date(),
                    staff.getLine_Manager(),
                    staff.getAccess_Level(),
            };
            staffTableModel.addRow(row);
        };
    };

    public void refreshAppointmentTable(ArrayList< Appointments >listofAppointment) {
        appointmentTableModel.setRowCount(0);
        for (int i = 0; i < listofAppointment.size(); i = i + 1) {
            Appointments appointment = listofAppointment.get(i);

            Object[] row = {
                    appointment.getAppointment_ID(),
                    appointment.getPatient_ID(),
                    appointment.getClinician_ID(),
                    appointment.getFacility_ID(),
                    appointment.getAppointment_Date(),
                    String.valueOf(appointment.getAppointment_Time()),
                    String.valueOf(appointment.getDuration_Minutes()),
                    appointment.getAppointment_Types(),
                    appointment.getStatus(),
                    appointment.getReason_for_Visit(),
                    appointment.getNotes(),
                    appointment.getCreated_Date(),
                    appointment.getDate_Modified(),
            };
            appointmentTableModel.addRow(row);
        }
    }

    public void refreshPatientsTable(ArrayList<Patients>listofPatients) {
        staffTableModel.setRowCount(0);
        for (int i = 0; i < listofPatients.size(); i = i + 1) {
            Patients patients = listofPatients.get(i);

            Object[] row = {
                    patients.getID(),
                    patients.getFirstName(),
                    patients.getLastName(),
                    patients.getDate_of_Birth(),
                    patients.getNhs_Number(),
                    patients.getGender(),
                    patients.getPhoneNumber(),
                    patients.getEmailAddress(),
                    patients.getHome_Address(),
                    patients.getPostcode(),
                    patients.getEmergency_contact_Name(),
                    patients.getEmergency_contact_phone_Number(),
                    patients.getRegistration_Date(),
                    patients.getGp_surgery_ID(),
            };
            patientTableModel.addRow(row);
        }
    }
    public void refreshPrescriptionTable(ArrayList < Prescriptions > listofPrescriptions) {
        prescriptionTableModel.setRowCount(0);
        for (int i = 0; i < listofPrescriptions.size(); i = i + 1) {
            Prescriptions prescriptions = listofPrescriptions.get(i);

            Object[] row = {
                    prescriptions.getPrescription_ID(),
                    prescriptions.getPatient_ID(),
                    prescriptions.getClinician_ID(),
                    prescriptions.getAppointment_ID(),
                    prescriptions.getPrescription_Date(),
                    prescriptions.getMedication_Name(),
                    prescriptions.getMedication_Dosage(),
                    prescriptions.getFrequency(),
                    prescriptions.getDuration_Days(),
                    prescriptions.getMedication_Quantity(),
                    prescriptions.getInstructions(),
                    prescriptions.getPharmacy_Name(),
                    prescriptions.getStatus(),
                    prescriptions.getIssue_Date(),
                    prescriptions.getCollection_Date(),
            };
            prescriptionTableModel.addRow(row);
        }
    }
        public void refreshReferralTable(ArrayList < Referrals > listofReferral) {
                referralsTableModel.setRowCount(0);
                for (int i = 0; i < listofReferral.size(); i = i + 1) {
                    Referrals referrals = listofReferral.get(i);

                    Object[] row = {
                            referrals.getReferral_ID(),
                            referrals.getPatient_ID(),
                            referrals.getReferring_clinician_ID(),
                            referrals.getReferred_to_clinician_ID(),
                            referrals.getReferring_facility_ID(),
                            referrals.getReferring_to_facility_ID(),
                            referrals.getReferral_Date(),
                            referrals.getUrgency_Level(),
                            referrals.getReferral_Reason(),
                            referrals.getClinical_Summary(),
                            referrals.getRequested_Investigation(),
                            referrals.getStatus(),
                            referrals.getAppointment_ID(),
                            referrals.getNotes(),
                            referrals.getCreated_Date(),
                            referrals.getLast_Updated(),
                    };
                    referralsTableModel.addRow(row);
                }
        }
        public void refreshClinicianTable(ArrayList < Clinicians > listofclinician) {
            cliniciansTableModel.setRowCount(0);
            for (int i = 0; i < listofclinician.size(); i = i + 1) {
                Clinicians clinicians= listofclinician.get(i);
    
                Object[] row = {
                        clinicians.getID(),
                        clinicians.getFirstName(),
                        clinicians.getLastName(),
                        clinicians.getEmailAddress(),
                        clinicians.getGmc_Number(),
                        clinicians.getTitle(),
                        clinicians.getSpeciality(),
                        clinicians.getGmc_Number(),
                        clinicians.getWork_place_ID(),
                        clinicians.getWork_place_Type(),
                        clinicians.getEmployment_Status(),
                        clinicians.getStart_Date(),
                };
                cliniciansTableModel.addRow(row);
            }
        }
        public void refreshFacilitiesTable(ArrayList < Facilities > listofFacilities) {
            facilitiesTableModel.setRowCount(0);
            for (int i = 0; i < listofFacilities.size(); i = i + 1) {
                Facilities facilities = listofFacilities.get(i);
    
                Object[] row = {
                        facilities.getFacility_ID(),
                        facilities.getFacility_Name(),
                        facilities.getFacility_Type(),
                        facilities.getAddress(),
                        facilities.getPostCode(),
                        facilities.getPhone_number(),
                        facilities.getEmail_Address(),
                        facilities.getOpening_Hours(),
                        facilities.getManager_Name(),
                        facilities.getCapacity(),
                        facilities.getSpecialities_Offered(),
                };
                facilitiesTableModel.addRow(row);
            }
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
        tabsPane.addTab("Prescriptions", createPrescriptionPanel());
        tabsPane.addTab("Clinicians", createCliniciansPanel());
        tabsPane.addTab("Staff", createStaffPanel());
        tabsPane.addTab("Facilities", createFacilitiesPanel());
        tabsPane.addTab("Referrals", createReferralsPanel());
        add(tabsPane);

     }
     private JPanel createPatientPanel(){
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        JLabel titleLabel = new JLabel("Patients");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(titleLabel, BorderLayout.NORTH);
        String[] columns ={"patient_id","first_name","last_name","date_of_birth","nhs_number","gender","phone_number",
                "email address","postcode","emergency_contact_name","emergency_contact_phone","registration_date"
                ,"gp_surgery_id"};
        patientTableModel = new DefaultTableModel(columns, 0) {
            public boolean isCellEditable(int row, int column){

                return false;
             }

         };
        patientTable = new JTable (patientTableModel);
        JScrollPane scrollPane = new JScrollPane(patientTable);
        panel.add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JButton addPatientButton = new JButton("Add Patient");
        JButton addDeletePatientButton = new JButton("Delete Patient");
        JButton addPatienteditButton = new JButton("Edit Patient");
        JButton addUpdateButton = new JButton("Update Patient");
        JButton addRefreshButton = new JButton("Refresh Patient");

        buttonPanel.add(addPatientButton);
        buttonPanel.add(addDeletePatientButton);
        buttonPanel.add(addPatienteditButton);
        buttonPanel.add(addUpdateButton);
        buttonPanel.add(addRefreshButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        return panel;
     }
    private JPanel createAppointmentPanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        JLabel titleLabel = new JLabel("Appointments");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(titleLabel, BorderLayout.NORTH);
        String[] columns ={"appointment_id","patient_id","clinician_id","facility_id","appointment_date","appointment_time",
                "duration_minutes","appointment_type","status","reason_for_visit","notes","created_date","last_modified"};
        appointmentTableModel = new DefaultTableModel(columns, 0) {
            public boolean isCellEditable(int row, int column) {

                return false;
            }

        };
        appointmentTable = new JTable(appointmentTableModel);
        JScrollPane scrollPane = new JScrollPane(appointmentTable);
        panel.add(scrollPane, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JButton addCreateAppointmentButton = new JButton("Create Appointment");
        JButton addDeleteAppointmentButton = new JButton("Delete Appointment");
        JButton addUpdateAppointmentButton = new JButton("Update Appointment");
        JButton addEditAppointmentButton = new JButton("Edit Appointment");
        JButton addRefreshAppointmentButton = new JButton("Refresh Appointment");

        buttonPanel.add(addCreateAppointmentButton);
        buttonPanel.add(addDeleteAppointmentButton);
        buttonPanel.add(addUpdateAppointmentButton);
        buttonPanel.add(addEditAppointmentButton);
        buttonPanel.add(addRefreshAppointmentButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        return panel;

    }

    private JPanel createPrescriptionPanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        JLabel titleLabel = new JLabel("Prescription");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(titleLabel, BorderLayout.NORTH);
        String[] columns ={"prescription_id","patient_id","clinician_id","appointment_id","prescription_date","medication_name"
                ,"dosage","frequency","duration_days","quantity","instructions","pharmacy_name","status","issue_date"
                ,"collection_date"};
        prescriptionTableModel = new DefaultTableModel(columns, 0) {
            public boolean isCellEditable(int row, int column) {

                return false;
            }

        };
        prescriptionTable = new JTable(prescriptionTableModel);
        JScrollPane scrollPane = new JScrollPane(prescriptionTable);
        panel.add(scrollPane, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JButton addCreatePrescriptionButton = new JButton("Create Prescription");
        JButton addDeletePrescriptionButton = new JButton("Delete Prescription");
        JButton addUpdatePrescriptionButton = new JButton("Update Prescription");
        JButton addEditPrescriptionButton = new JButton("Edit Prescription");
        JButton addChangePrescriptionButton = new JButton("Change Prescription");

        buttonPanel.add(addCreatePrescriptionButton);
        buttonPanel.add(addDeletePrescriptionButton);
        buttonPanel.add(addUpdatePrescriptionButton);
        buttonPanel.add(addEditPrescriptionButton);
        buttonPanel.add(addChangePrescriptionButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        return panel;

    }

    private JPanel createCliniciansPanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        JLabel titleLabel = new JLabel("Clinicians");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(titleLabel, BorderLayout.NORTH);
        String[] columns ={"clinician_id","first_name","last_name","title","speciality","gmc_number","phone_number",
                "email", "workplace_id", "workplace_type", "employment_status","start_date"};
        cliniciansTableModel = new DefaultTableModel(columns, 0) {
            public boolean isCellEditable(int row, int column) {

                return false;
            }

        };
        cliniciansTable = new JTable(cliniciansTableModel);
        JScrollPane scrollPane = new JScrollPane(cliniciansTable);
        panel.add(scrollPane, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JButton addCliniciansButton = new JButton("Add Clinicians");
        JButton addRemoveCliniciansButton = new JButton("Delete Clinicians");
        JButton addUpdateButton = new JButton("Update Clinicians ");
        JButton addClinicianEditButton = new JButton("Edit Clinicians");
        JButton addRefreshButton = new JButton("Refresh Clinicians");

        buttonPanel.add(addCliniciansButton);
        buttonPanel.add(addRemoveCliniciansButton);
        buttonPanel.add(addUpdateButton);
        buttonPanel.add(addClinicianEditButton);
        buttonPanel.add(addRefreshButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        return panel;
    }

    private JPanel createStaffPanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        JLabel titleLabel = new JLabel("Staff");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(titleLabel, BorderLayout.NORTH);
        String[] columns ={"staff_id","first_name","last_name","facility id","phone number","email","department","role"
                            ,"employment_status","start_date","line_manager","access_level"};
            staffTableModel = new DefaultTableModel(columns, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        staffTable = new JTable(staffTableModel);
        JScrollPane scrollPane = new JScrollPane(staffTable);
        panel.add(scrollPane, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JButton addStaffButton = new JButton("Add Staff");
        JButton addRemoveStaffButton = new JButton("Delete Staff");
        JButton addUpdateButton = new JButton("Update Staff");
        JButton addStaffEditButton = new JButton("Edit Staff");
        JButton addRefreshButton = new JButton("Refresh Staff");

        buttonPanel.add(addStaffButton);
        buttonPanel.add(addRemoveStaffButton);
        buttonPanel.add(addUpdateButton);
        buttonPanel.add(addStaffEditButton);
        buttonPanel.add(addRefreshButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        return panel;
    }

    private JPanel createFacilitiesPanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        JLabel titleLabel = new JLabel("Facilities");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(titleLabel, BorderLayout.NORTH);
        String[] columns ={"facility_id","facility_name","facility_type","address","postcode","phone_number","email"
                ,"opening_hours","manager_name","capacity","specialities_offered"};
        facilitiesTableModel = new DefaultTableModel(columns, 0) {
            public boolean isCellEditable(int row, int column) {

                return false;
            }
        };
        facilitiesTable = new JTable(facilitiesTableModel);
        JScrollPane scrollPane = new JScrollPane(facilitiesTable);
        panel.add(scrollPane, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JButton addFacilitiesButton = new JButton("Add Facilities");
        JButton addDeleteFacilitiesButton = new JButton("Delete Facilities");
        JButton addUpdateButton = new JButton("Update Facilities");
        JButton addStaffEditButton = new JButton("Edit Facilities");
        JButton addRefreshButton = new JButton("Refresh Facilities");

        buttonPanel.add(addFacilitiesButton);
        buttonPanel.add(addDeleteFacilitiesButton);
        buttonPanel.add(addUpdateButton);
        buttonPanel.add(addStaffEditButton);
        buttonPanel.add(addRefreshButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        return panel;
    }
    private JPanel createReferralsPanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        JLabel titleLabel = new JLabel("Referrals");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(titleLabel, BorderLayout.NORTH);
        String[] columns ={"referral_id","patient_id","referring_clinician_id","referred_to_clinician_id","referring_facility_id"
                ,"referred_to_facility_id","referral_date","urgency_level","referral_reason","clinical_summary","requested_investigations"
                ,"status","appointment_id","notes","created_date","last_updated"};
        referralsTableModel = new DefaultTableModel(columns, 0) {
            public boolean isCellEditable(int row, int column) {

                return false;
            }
        };
        referralsTable = new JTable(referralsTableModel);
        JScrollPane scrollPane = new JScrollPane(referralsTable);
        panel.add(scrollPane, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JButton addCreateReferralButton = new JButton("Create Referral");
        JButton addDeleteReferralButton = new JButton("Delete Referral");
        JButton addUpdateReferralButton = new JButton("Update Referral");
        JButton addReferralEditButton = new JButton("Edit Referral");
        JButton addRefreshButton = new JButton("Refresh Referral");

        buttonPanel.add(addCreateReferralButton);
        buttonPanel.add(addDeleteReferralButton);
        buttonPanel.add(addUpdateReferralButton);
        buttonPanel.add(addReferralEditButton);
        buttonPanel.add(addRefreshButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        return panel;
    }

    public String getText() {
        return exampleField.getText();
    }

    public void addSetListener(ActionListener al) {
        exampleButton.addActionListener(al); // Allows the controller to get information
    }
    // Creating a method to show the Healthcare Controllers Messages.
    public void showMessage(String s) {
    }
    // Creating a method for the display view ArrayLists.
    public void displayReferrals(ArrayList<Referrals> allReferrals) {
    }
    public void displayFacilities(ArrayList<Facilities> allFacilities) {
    }
    public void displayStaff(ArrayList<Staff> allStaffMembers) {
    }
    public void displayClinicians(ArrayList<Clinicians> allClinicians) {
    }
    public void displayPrescriptions(ArrayList<Prescriptions> allPrescriptions) {
    }
    public void displayAppointments(ArrayList<Appointments> allAppointments) {
    }
    public void displayPatients(ArrayList<Patients> allPatients) {
    }
}
















