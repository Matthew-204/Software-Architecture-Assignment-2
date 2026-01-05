package Model;

import File_handler.File_Manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HealthcareSystem {

    private HashMap<String, Staff> staffStore;
    private HashMap<String, Appointments> appointmentStore;
    private HashMap<String, Clinicians> clinicianStore;
    private HashMap<String, Facilities> facilitiesStore;
    private HashMap<String, Patients> patientStore;
    private HashMap<String, Prescriptions> prescriptionStore;
    private HashMap<String, Referrals> referralStore;


    private static final String FOLDER = "data/";
    private static final String STAFFLOCATION = "staff.csv";
    private static final String APPOINTMENTLOCATION = "appointments.csv";
    private static final String CLINICIANLOCATION = "clinicians.csv";
    private static final String FACILITIESLOCATION = "facilities.csv";
    private static final String PATIENTLOCATION = "patients.csv";
    private static final String PRESCRIPTIONLOCATION = "Prescriptions.csv";
    private static final String REFERRALSLOCATION = "referrals.csv";

    /**
     * A constructor for the healthcare system model
     */
    public HealthcareSystem() {
        staffStore = new HashMap<String, Staff>();
        appointmentStore = new HashMap<String, Appointments>();
        clinicianStore = new HashMap<String, Clinicians>();
        facilitiesStore = new HashMap<String, Facilities>();
        patientStore = new HashMap<String, Patients>();
        prescriptionStore = new HashMap<String, Prescriptions>();
        referralStore = new HashMap<String, Referrals>();
        loadAllData();
    }

    /**
     * groups up all the load data call into one
     */
    public void loadAllData() {
        loadStaff();
        loadAppointment();
        loadPatient();
        loadPrescription();
        loadReferrals();
        loadClinician();
        loadFacilities();
    }

    /**
     * loads the staff instance into new objects from the file
     */
    public void loadStaff() {
        List<String[]> lines = File_Manager.readFile(FOLDER + STAFFLOCATION);
        for (String[] element : lines) {
            Staff staff = Staff.fromCSV(element);
            staffStore.put(staff.getID(), staff);
        }
    }

    public ArrayList<Staff> getAllStaffMembers() {
        return new ArrayList<>(staffStore.values());
    }

    /**
     * save the instance of staff to the file location
     */
    public void saveStaff() {
        ArrayList<Staff> staffList = new ArrayList<Staff>(staffStore.values());
        for (Staff staff : staffList) {
            File_Manager.writeFile(FOLDER + STAFFLOCATION, staff.toCSV());
        }
    }

    /**
     * add new staff instance to the staff store and resaves cvs file
     *
     * @param staff new instance to object
     */
    public void addStaff(Staff staff) {
        staffStore.put(staff.getID(), staff);
        saveStaff();
    }

    public void loadAppointment() {
        List<String[]> lines = File_Manager.readFile(FOLDER + APPOINTMENTLOCATION);
        for (String[] element : lines) {
            Appointments appointments = Appointments.fromCSV(element);
            appointmentStore.put(appointments.getAppointment_ID(), appointments);
        }
    }

    public ArrayList<Appointments> getAllAppointments() {
        return new ArrayList<>(appointmentStore.values());
    }

    public void saveAppointment() {
        ArrayList<Appointments> appointmentList = new ArrayList<Appointments>(appointmentStore.values());
        for (Appointments appointments : appointmentList) {
            File_Manager.writeFile(FOLDER + APPOINTMENTLOCATION, appointments.toCSV());
        }
    }

    public void addAppointment(Appointments appointments) {
        appointmentStore.put(appointments.getAppointment_ID(), appointments);
        saveAppointment();
    }

    public void loadPatient() {
        List<String[]> lines = File_Manager.readFile(FOLDER + PATIENTLOCATION);
        for (String[] element : lines) {
            Patients patients = Patients.fromCSV(element);
            patientStore.put(patients.getID(), patients);
        }
    }

    public ArrayList<Patients> getAllPatients() {
        return new ArrayList<>(patientStore.values());
    }

    public void savePatient() {
        ArrayList<Patients> patientList = new ArrayList<Patients>(patientStore.values());
        for (Patients patient : patientList) {
            File_Manager.writeFile(FOLDER + PATIENTLOCATION, patient.toCSV());
        }
    }

    public void addPatient(Patients patient) {
        patientStore.put(patient.getID(), patient);
        savePatient();
    }

    public void loadPrescription() {
        List<String[]> lines = File_Manager.readFile(FOLDER + PRESCRIPTIONLOCATION);

        for (String[] element : lines) {
            Prescriptions prescriptions = Prescriptions.fromCSV(element);
            prescriptionStore.put(prescriptions.getPrescription_ID(), prescriptions);
        }

    }

    public ArrayList<Prescriptions> getAllPrescriptions() {
        return new ArrayList<>(prescriptionStore.values());
    }

    public void savePrescription() {
        ArrayList<Prescriptions> prescriptionList = new ArrayList<Prescriptions>(prescriptionStore.values());
        for (Prescriptions prescription : prescriptionList) {
            File_Manager.writeFile(FOLDER + PRESCRIPTIONLOCATION, prescription.toCSV());
        }
    }

    public void addPrescription(Prescriptions prescriptions) {
        prescriptionStore.put(prescriptions.getPrescription_ID(), prescriptions);
        savePrescription();
    }

    public void loadReferrals() {
        List<String[]> lines = File_Manager.readFile(FOLDER + REFERRALSLOCATION );
        for (String[] element : lines) {
            Referrals referrals = Referrals.fromCSV(element);
            referralStore.put(referrals.getReferral_ID(), referrals);
        }
    }
    public ArrayList<Referrals> getAllReferrals() {
        return new ArrayList<>(referralStore.values());
    }

    public void saveReferrals() {
        ArrayList<Referrals> referralList = new ArrayList<Referrals>(referralStore.values());
        for (Referrals referrals : referralList) {
            File_Manager.writeFile(FOLDER + REFERRALSLOCATION, referrals.toCSV());
        }
    }
    public void addReferrals(Referrals referrals) {
        referralStore.put(referrals.getReferral_ID(), referrals);
        saveReferrals();
    }

    public void loadClinician() {
        List<String[]> lines = File_Manager.readFile(FOLDER + CLINICIANLOCATION);
        for (String[] element : lines) {
            Clinicians clinicians = null;
            try {
                clinicians = Clinicians.fromCSV(element);
            } catch (Exception e) {
                e.printStackTrace();
            }
            clinicianStore.put(clinicians.getID(), clinicians);
        }
    }
    public ArrayList<Clinicians> getAllClinicians() {
        return new ArrayList<>(clinicianStore.values());
    }

    public void saveClinician() {
        ArrayList<Clinicians> clinicianList = new ArrayList<Clinicians>(clinicianStore.values());
        for (Clinicians clinicians : clinicianList) {
            File_Manager.writeFile(FOLDER + CLINICIANLOCATION, clinicians.toCSV());
        }
    }
    public void addClinicians(Clinicians clinicians) {
        clinicianStore.put(clinicians.getID(), clinicians);
        saveClinician();{
        }
    }
    public void loadFacilities() {
        List<String[]> lines = File_Manager.readFile(FOLDER + FACILITIESLOCATION);
        for (String[] element : lines) {
            Facilities facilities = null;
            try {
                facilities = Facilities.fromCSV(element);
            } catch (Exception e) {
                e.printStackTrace();
            }
            facilitiesStore.put(facilities.getFacility_ID(),facilities);
        }
    }
    public ArrayList<Facilities> getAllFacilities() {
        return new ArrayList<>(facilitiesStore.values());
    }

    public void saveFacilities() {
        ArrayList<Facilities> FacilitiesList = new ArrayList<Facilities>(facilitiesStore.values());
        for (Facilities facilities :FacilitiesList) {
            File_Manager.writeFile(FOLDER + FACILITIESLOCATION, facilities.toCSV());
        }
    }
    public void addFacilities(Facilities facilities) {
        facilitiesStore.put(facilities.getFacility_ID(),facilities);
        saveFacilities();{
        }
    }
        // Creating methods for the Patient Display view
    public void deletePatient(String patientID) {
    }
    public void editPatient(String patientID, Patients patient){
    }
    public void updatePatient(String patientID, Patients patient) {
    }
    public void refreshPatient(String patientID, Patients patient) {
    }

        // Creating methods for the Appointment Display view
    public void deleteAppointment(String appointmentID) {
    }
    public void updateAppointment(String appointmentID, Appointments appointment) {
    }
    public void editAppointment(String appointmentID, Appointments appointment) {
    }
    public void refreshAppointment(String appointmentID, Appointments appointment) {
    }

        // Creating methods for the Prescription Display view
    public void deletePrescription(Prescriptions prescriptionID) {
    }
    public void updatePrescription(String prescriptionID, Prescriptions prescription) {
    }
    public void editPrescription(String prescriptionID, Prescriptions prescription) {
    }
    public void changePrescription(String prescriptionID, Prescriptions prescription) {
    }

        // Creating methods for the Clinician Display view
    public void deleteClinician(Clinicians clinicianID) {
    }
    public void updateClinician(String clinicianID, Clinicians clinician) {
    }
    public void editClinician(String clinicianID, Clinicians clinician) {
    }
    public void refreshClinician(String clinicianID, Clinicians clinician) {
    }

        // Creating methods for the Staff Display view
    public void deleteStaff(Staff staffID) {
    }
    public void updateStaff(String staffID, Staff staff) {
    }
    public void editStaff(String staffID, Staff staff) {
    }
    public void refreshStaff(String staffID, Staff staff) {
    }

        // Creating methods for the Facilities Display View
    public void deleteFacilities(Facilities facilityID) {
    }
    public void updateFacilities(String facilityID, Facilities facilities) {
    }
    public void editFacilities(String facilityID, Facilities facilities) {
    }
    public void refreshFacilities(String facilityID, Facilities facilities) {
    }
        // Creating methods for the Referral Display View
    public void createReferrals(Referrals referrals) {
    }
    public void deleteReferrals(Referrals referralID) {
    }
    public void updateReferrals(String referralID, Referrals referrals) {
    }
    public void editReferrals(String referralID, Referrals referrals) {
    }
    public void refreshReferrals(String referralID, Referrals referrals) {
    }
}
