package Model;

public class Patients extends Person {
        private String patient_ID;
        private String gender;
        private String date_of_Birth;
        private String home_Address;
        private String nhs_Number;
        private String postcode;
        private String emergency_contact_Name;
        private String emergency_contact_phone_Number;
        private String registration_Date;
        private String gp_surgery_ID;


    public Patients() {
        super();
    }

    public Patients(String firstName, String lastName, String emailAddress, String phoneNumber,
                    String patient_ID, String gender,String date_of_Birth, String home_Address,
                    String nhs_Number,  String postcode, String emergency_contact_Name,
                    String emergency_contact_phone_Number, String registration_Date, String gp_surgery_ID)
    {
        super(firstName, lastName, emailAddress, phoneNumber);

        this.patient_ID = patient_ID;
        this.gender = gender;
        this.date_of_Birth = date_of_Birth;
        this.home_Address = home_Address;
        this.nhs_Number = nhs_Number;
        this.postcode = postcode;
        this.emergency_contact_Name = emergency_contact_Name;
        this.emergency_contact_phone_Number = emergency_contact_phone_Number;
        this.registration_Date = registration_Date;
        this.gp_surgery_ID = gp_surgery_ID;
    }

    public String getPatient_ID() {
        return patient_ID;
    }

    public void setPatient_ID(String patient_ID) {
        this.patient_ID = patient_ID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate_of_Birth() {
        return date_of_Birth;
    }

    public void setDate_of_Birth(String date_of_Birth) {
        this.date_of_Birth = date_of_Birth;
    }

    public String getHome_Address() {
        return home_Address;
    }

    public void setHome_Address(String home_Address) {
        this.home_Address = home_Address;
    }

    public String getNhs_Number() {
        return nhs_Number;
    }

    public void setNhs_Number(String nhs_Number) {
        this.nhs_Number = nhs_Number;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getEmergency_contact_Name() {
        return emergency_contact_Name;
    }

    public void setEmergency_contact_Name(String emergency_contact_Name) {
        this.emergency_contact_Name = emergency_contact_Name;
    }

    public String getEmergency_contact_phone_Number() {
        return emergency_contact_phone_Number;
    }

    public void setEmergency_contact_phone_Number(String emergency_contact_phone_Number) {
        this.emergency_contact_phone_Number = emergency_contact_phone_Number;
    }

    public String getRegistration_Date() {
        return registration_Date;
    }

    public void setRegistration_Date(String registration_Date) {
        this.registration_Date = registration_Date;
    }

    public String getGp_surgery_ID() {
        return gp_surgery_ID;
    }

    public void setGp_surgery_ID(String gp_surgery_ID) {
        this.gp_surgery_ID = gp_surgery_ID;
    }
}


