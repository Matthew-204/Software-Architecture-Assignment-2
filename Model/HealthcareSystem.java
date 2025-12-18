package Model;

import File_handler.File_Manager;

import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HealthcareSystem {

    private HashMap<String, Staff> staffStore;
    private HashMap<String, Appointments> appointmentStore;
    private HashMap<String, Clinicians > clinicianStore;
    private HashMap<String, Facilities > facilitiesStore;
    private HashMap<String, Patients > patientStore;
    private HashMap<String, Prescriptions > prescriptionStore;
    private HashMap<String, Referrals > referralsStore;


    private static final String FOLDER = "data/";
    private static final String STAFFLOCATION = "staff.csv";
    private static final String APPOINTMENTLOCATION ="appointments.csv";
    private static final String CLINICIANLOCATION = "clinicians.csv";
    private static final String FACILITIESLOCATION = "facilities.csv";
    private static final String PATIENTLOCATION = "patients.csv";
    private static final String PRESCRIPTIONLOCATION = "Prescriptions.csv";
    private static final String REFERRALSLOCATION = "Referrals.csv";

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
        referralsStore = new HashMap<String, Referrals>();
        loadAllData();
    }

    /**
     * groups up all the load data call into one
     */
    public void loadAllData()
    {
        loadStaff();
        // add other instance of load data
    }

    /**
     * loads the staff instance into new objects from the file
     */
    public void loadStaff()
    {
        List<String[]> lines = File_Manager.readFile(FOLDER + STAFFLOCATION);
        for (String[] element : lines) {
            Staff staff = Staff.fromCVS(element);
            staffStore.put(staff.getID() ,staff);
        }
    }
    public ArrayList<Staff> getAllStaffMembers(){
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
     * @param staff new instance to object
     */
    public void addStaff(Staff staff) {
        staffStore.put(staff.getID(), staff);
        saveStaff();
    }
}
