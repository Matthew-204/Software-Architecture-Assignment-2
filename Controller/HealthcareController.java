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
    private void loadTables()
    {
        view.refreshStaffTable(model.getAllStaffMembers());
        view.refreshAppointmentTable(model.getAllAppointments());
        view.refreshPatientsTable(model.getAllPatients());
        view.refreshPrescriptionTable(model.getAllPrescriptions());
        view.refreshReferralTable(model.getAllReferrals());
        view.refreshClinicianTable(model.getAllClinicians());
        view.refreshFacilitiesTable(model.getAllFacilities());
    }

    private class SetListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Showing Text: " + view.getText());
        }
    }
        // Operations for the Patients display view.
    public void loadPatients() {view.displayPatients(model.getAllPatients());}

    public void addPatient(Patients patient){
        model.addPatient(patient);
        loadPatients();
        view.showMessage("Patient record has been successfully Created!");
    }
    public void deletePatient(String patientID){
        model.deletePatient(patientID);
        loadPatients();
        view.showMessage("Patient record has been successfully Deleted!");
    }
    public void editPatient(String patientID, Patients patient){
        model.editPatient(patientID, patient);
        loadPatients();
        view.showMessage("Patient record has been successfully Edited!");
    }
    public void updatePatient(String patientID, Patients patient){
        model.updatePatient(patientID,patient);
        loadPatients();
        view.showMessage("Patient record has been successfully Updated! ");
    }
    public void refreshPatient(String patientID, Patients patient){
        model.refreshPatient(patientID, patient);
        loadPatients();
        view.showMessage("Patient record has been successfully Refreshed!");

    }
        // Operations for the Appointment display view.
    public void loadAppointments(){view.displayAppointments(model.getAllAppointments());}

    public void createAppointment(Appointments appointment){
        model.addAppointment(appointment);
        loadAppointments();
        view.showMessage("Appointment has been successfully Created!");
    }
    public void deleteAppointment(String appointmentID){
        model.deleteAppointment(appointmentID);
        loadAppointments();
        view.showMessage("Appointment has been successfully Deleted!");
    }
    public void updateAppointment(String appointmentID, Appointments appointment){
        model.updateAppointment(appointmentID, appointment);
        loadAppointments();
        view.showMessage("Appointment has been successfully Updated!");
    }
    public void editAppointment(String appointmentID, Appointments appointment){
       model.editAppointment(appointmentID, appointment);
       loadAppointments();
       view.showMessage("Appointment has been successfully Edited!");
    }
    public void refreshAppointment(String appointmentID, Appointments appointment){
        model.refreshAppointment(appointmentID, appointment);
        loadAppointments();
        view.showMessage("Appointment booking has been successfully Refreshed");
    }
        // Operations for the Prescription display view.
    public void loadPrescriptions(){view.displayPrescriptions(model.getAllPrescriptions());}

    public void createPrescription(Prescriptions prescription){
        model.addPrescription(prescription);
        loadPrescriptions();
        view.showMessage("Patient Prescription has been successfully Created!");
    }
    public void deletePrescription(Prescriptions prescriptionID){
        model.deletePrescription(prescriptionID);
        loadPrescriptions();
        view.showMessage("Patient Prescription has been successfully Deleted!");
    }
    public void updatePrescription(String prescriptionID, Prescriptions prescription){
        model.updatePrescription(prescriptionID, prescription);
        loadPrescriptions();
        view.showMessage("Patient Prescription has been successfully Updated!");
    }
    public void editPrescription(String prescriptionID, Prescriptions prescription){
        model.editPrescription(prescriptionID, prescription);
        loadPrescriptions();
        view.showMessage("Patient Prescription has been successfully Edited!");
    }
    public void changePrescription(String prescriptionID, Prescriptions prescription){
        model.changePrescription(prescriptionID, prescription);
        loadPrescriptions();
        view.showMessage("Patient Prescription has been successfully Changed!");
    }
        // Operations for the Clinicians display view.
    public void loadClinicians(){view.displayClinicians(model.getAllClinicians());}

    public void createClinicians(Clinicians clinician){
        model.addClinicians(clinician);
        loadClinicians();
        view.showMessage("Clinicians account has been successfully Created!");
    }
    public void deleteClinician(Clinicians clinicianID){
        model.deleteClinician(clinicianID);
        loadClinicians();
        view.showMessage("Clinicians account has been successfully Deleted!");
    }
    public void updateClinician(String clinicianID, Clinicians clinician){
        model.updateClinician(clinicianID, clinician);
        loadClinicians();
        view.showMessage("Clinicians account has been successfully Updated!");
    }
    public void editClinician(String clinicianID, Clinicians clinician){
        model.editClinician(clinicianID, clinician);
        loadClinicians();
        view.showMessage("Clinicians account has been successfully Edited!");
    }
    public void refreshClinician(String clinicianID, Clinicians clinician){
        model.refreshClinician(clinicianID, clinician);
        loadClinicians();
        view.showMessage("Clinicians account has been successfully Refreshed!");
    }
        // Operations for the Staff display view.
    public void loadStaff(){view.displayStaff(model.getAllStaffMembers());}

    public void CreateStaff(Staff staff){
        model.addStaff(staff);
        loadStaff();
        view.showMessage("Staff account has been successfully Created!");
    }
    public void deleteStaff(Staff staffID){
        model.deleteStaff(staffID);
        loadStaff();
        view.showMessage("Staff account has been successfully Deleted!");
    }
    public void updateStaff(String staffID, Staff staff){
        model.updateStaff(staffID, staff);
        loadStaff();
        view.showMessage("Staff account has been successfully Updated!");
    }
    public void editStaff(String staffID, Staff staff){
        model.editStaff(staffID, staff);
        loadStaff();
        view.showMessage("Staff account has been successfully Edited!");
    }
    public void refreshStaff(String staffID, Staff staff){
        model.refreshStaff(staffID, staff);
        loadStaff();
        view.showMessage("Staff accounts have been successfully Refreshed !");
    }
    // Operations for the Facilities display view.
    public void loadFacilities(){view.displayFacilities(model.getAllFacilities());}

    public void createFacilities(Facilities facilities){
        model.addFacilities(facilities);
        loadFacilities();
        view.showMessage("Facility has been successfully Added!");
    }
    public void deleteFacilities(Facilities FacilityID){
        model.deleteFacilities(FacilityID);
        loadFacilities();
        view.showMessage("Facility has been successfully Deleted!");
    }
    public void updateFacilities(String FacilityID, Facilities facilities){
        model.updateFacilities(FacilityID, facilities);
        loadFacilities();
        view.showMessage("Facility has been successfully Updated!");
    }
    public void editFacilities(String FacilityID, Facilities facilities){
        model.editFacilities(FacilityID, facilities);
        loadFacilities();
        view.showMessage("Facility has been successfully Edited!");
    }
    public void refreshFacilities(String FacilityID, Facilities facilities){
        model.refreshFacilities(FacilityID, facilities);
        loadFacilities();
        view.showMessage("Facility has been successfully Refreshed!");
    }
        // Operations for the Referral display view.
    public void loadReferrals() {view.displayReferrals(model.getAllReferrals());}

    public void createReferrals(Referrals referrals){
        model.createReferrals(referrals);
        loadReferrals();
        view.showMessage("Patient referral has been successfully Created!");
    }
    public void deleteReferrals(Referrals referralID){
        model.deleteReferrals(referralID);
        loadReferrals();
        view.showMessage("Patient referral has been successfully Deleted!");
    }
    public void updateReferrals(String referralID, Referrals referrals){
        model.updateReferrals(referralID, referrals);
        loadReferrals();
        view.showMessage("Patient referral has been successfully Updated!");
    }
    public void editReferrals(String referralID, Referrals referrals){
        model.editReferrals(referralID, referrals);
        loadReferrals();
        view.showMessage("Patient referral has been successfully Edited!");
    }
    public void refreshReferrals(String referralID, Referrals referrals){
        model.refreshReferrals(referralID, referrals);
        loadReferrals();
        view.showMessage("Patient referrals have been successfully Refreshed!");
    }

    // initializes all the HealthcareGUI display Views

    public void initializeDisplayView(){
        loadPatients();
        loadAppointments();
        loadPrescriptions();
        loadClinicians();
        loadStaff();
        loadFacilities();
        loadReferrals();
    }
}




