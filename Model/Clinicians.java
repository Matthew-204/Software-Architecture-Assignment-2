package Model;

public class Clinicians extends Person {

    private String title;
    private String speciality;
    private String gmc_Number;
    private String work_place_ID;
    private String work_place_Type;
    private String employment_Status;
    private String start_Date;

    public Clinicians() {
        super();
    }

    public Clinicians(String ID, String firstName, String lastName, String emailAddress, String phoneNumber,
                      String title, String speciality, String gmc_Number, String work_place_ID,
                      String work_place_Type, String employment_Status, String start_Date)
    {

        super(ID, firstName, lastName, emailAddress, phoneNumber);

        this.title = title;
        this.speciality = speciality;
        this.gmc_Number = gmc_Number;
        this.work_place_ID = work_place_ID;
        this.work_place_Type = work_place_Type;
        this.employment_Status = employment_Status;
        this.start_Date = start_Date;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getGmc_Number() {
        return gmc_Number;
    }

    public void setGmc_Number(String gmc_Number) {
        this.gmc_Number = gmc_Number;
    }

    public String getWork_place_ID() {
        return work_place_ID;
    }

    public void setWork_place_ID(String work_place_ID) {
        this.work_place_ID = work_place_ID;
    }

    public String getWork_place_Type() {
        return work_place_Type;
    }

    public void setWork_place_Type(String work_place_Type) {
        this.work_place_Type = work_place_Type;
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

    public static Clinicians fromCVS(String[] element) {
        return new Clinicians (element[0], element[1], element[2], element[3],
                element[4], element[5], element[6], element[7], element[8],
                element[9], element[10], element[11]);
    };
    public String toCSV() {
        return ID + "," + firstName + "," + lastName + "," + emailAddress + "," + phoneNumber + "," + title
                + "," + speciality + "," + gmc_Number + "," + work_place_ID + "," + work_place_Type
                + "," + employment_Status + "," + start_Date;
    }
}


