package Model;

import File_handler.File_Manager;

import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HealthcareSystem {

    private HashMap<String, Staff> staffStore;

    private static final String FOLDER = "data/";
    private static final String STAFFLOCATION = "staff";

    /**
     * constructor for healthcare system
     */
    public HealthcareSystem() {
        staffStore = new HashMap<String, Staff>();
        // matthew create more new instance

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
