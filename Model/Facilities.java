package Model;

public class Facilities {
    private String facility_ID;
    private String facility_Name;
    private String facility_Type;
    private String Address;
    private String postCode;
    private int phone_number;
    private String email_Address;
    private String opening_Hours;
    private String manager_Name;
    private int capacity;
    private String specialities_Offered;

    public Facilities(String facility_ID, String facility_Name, String facility_Type, String Address, String postCode,
                      int phone_number, String email_Address, String opening_Hours, String manager_Name, int capacity,
                      String specialities_Offered){


        this.facility_ID = facility_ID;
        this.facility_Name = facility_Name;
        this.facility_Type = facility_Type;
        this.Address = Address;
        this.postCode = postCode;
        this.phone_number = phone_number;
        this.email_Address = email_Address;
        this.opening_Hours = opening_Hours;
        this.manager_Name = manager_Name;
        this.capacity = capacity;
        this.specialities_Offered =specialities_Offered;
    }

    public String getFacility_ID() {
        return facility_ID;
    }

    public void setFacility_ID(String facility_ID) {
        this.facility_ID = facility_ID;
    }

    public String getFacility_Name() {
        return facility_Name;
    }

    public void setFacility_Name(String facility_Name) {
        this.facility_Name = facility_Name;
    }

    public String getFacility_Type() {
        return facility_Type;
    }

    public void setFacility_Type(String facility_Type) {
        this.facility_Type = facility_Type;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail_Address() {
        return email_Address;
    }

    public void setEmail_Address(String email_Address) {
        this.email_Address = email_Address;
    }

    public String getOpening_Hours() {
        return opening_Hours;
    }

    public void setOpening_Hours(String opening_Hours) {
        this.opening_Hours = opening_Hours;
    }

    public String getManager_Name() {
        return manager_Name;
    }

    public void setManager_Name(String manager_Name) {
        this.manager_Name = manager_Name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getSpecialities_Offered() {
        return specialities_Offered;
    }

    public void setSpecialities_Offered(String specialities_Offered) {
        this.specialities_Offered = specialities_Offered;
    }
}
