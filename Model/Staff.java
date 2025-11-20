package Model;

public class Staff extends Person{
    private String staff_ID;
    private String job_Role;
    private String department_Name;
    private String facility_ID;
    private String employment_Status;
    private String start_Date;
    private String line_Manager;
    private String access_Level;

    public Staff() {
        super();
    }

    public Staff (String firstName, String lastName, String emailAddress, String phoneNumber,
                  String staff_ID, String job_Role, String department_Name, String facility_ID,
                  String employment_Status, String start_Date, String line_Manager, String access_Level)
    {
        super(firstName, lastName, emailAddress, phoneNumber);

        this.staff_ID = staff_ID;
        this.job_Role = job_Role;
        this.department_Name = department_Name;
        this.facility_ID = facility_ID;
        this.employment_Status = employment_Status;
        this.start_Date = start_Date;
        this.line_Manager = line_Manager;
        this.access_Level = access_Level;

    }

    public String getStaff_ID() {
        return staff_ID;
    }

    public void setStaff_ID(String staff_ID) {
        this.staff_ID = staff_ID;
    }

    public String getJob_Role() {
        return job_Role;
    }

    public void setJob_Role(String job_Role) {
        this.job_Role = job_Role;
    }

    public String getDepartment_Name() {
        return department_Name;
    }

    public void setDepartment_Name(String department_Name) {
        this.department_Name = department_Name;
    }

    public String getFacility_ID() {
        return facility_ID;
    }

    public void setFacility_ID(String facility_ID) {
        this.facility_ID = facility_ID;
    }

    public String getEmployment_Status() {
        return employment_Status;
    }

    public void setEmployment_Status(String employment_Status) {
        this.employment_Status = employment_Status;
    }

    public String getStart_Date() {
        return start_Date;
    }

    public void setStart_Date(String start_Date) {
        this.start_Date = start_Date;
    }

    public String getLine_Manager() {
        return line_Manager;
    }

    public void setLine_Manager(String line_Manager) {
        this.line_Manager = line_Manager;
    }

    public String getAccess_Level() {
        return access_Level;
    }

    public void setAccess_Level(String access_Level) {
        this.access_Level = access_Level;
    }
}