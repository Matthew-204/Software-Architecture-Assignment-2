package Model;

public class Appointments {
    private String appointment_ID;
    private String patient_ID;
    private String clinician_ID;
    private String facility_ID;
    private String appointment_Date;
    private String appointment_Time;
    private String duration_Minutes;
    private String appointment_Types;
    private String status;
    private String reason_for_Visit;
    private String notes;
    private String created_Date;
    private String date_Modified;

    public Appointments(String appointment_ID, String patient_ID, String clinician_ID, String facility_ID,
                        String appointment_Date, String appointment_Time, String duration_Minutes, String appointment_Types,
                        String status, String reason_for_Visit, String notes, String created_Date, String date_Modified) {

        this.appointment_ID = appointment_ID;
        this.patient_ID = patient_ID;
        this.clinician_ID = clinician_ID;
        this.facility_ID = facility_ID;
        this.appointment_Date = appointment_Date;
        this.appointment_Time = appointment_Time;
        this.duration_Minutes = duration_Minutes;
        this.appointment_Types = appointment_Types;
        this.status = status;
        this.reason_for_Visit = reason_for_Visit;
        this.notes = notes;
        this.created_Date = created_Date;
        this.date_Modified = date_Modified;

    }

    public String getAppointment_ID() {
        return appointment_ID;
    }

    public void setAppointment_ID(String appointment_ID) {
        this.appointment_ID = appointment_ID;
    }

    public String getPatient_ID() {
        return patient_ID;
    }

    public void setPatient_ID(String patient_ID) {
        this.patient_ID = patient_ID;
    }

    public String getClinician_ID() {
        return clinician_ID;
    }

    public void setClinician_ID(String clinician_ID) {
        this.clinician_ID = clinician_ID;
    }

    public String getFacility_ID() {
        return facility_ID;
    }

    public void setFacility_ID(String facility_ID) {
        this.facility_ID = facility_ID;
    }

    public String getAppointment_Date() {
        return appointment_Date;
    }

    public void setAppointment_Date(String appointment_Date) {
        this.appointment_Date = appointment_Date;
    }

    public String getAppointment_Time() {
        return appointment_Time;
    }

    public void setAppointment_Time(String appointment_Time) {
        this.appointment_Time = appointment_Time;
    }

    public String getDuration_Minutes() {
        return duration_Minutes;
    }

    public void setDuration_Minutes(String duration_Minutes) {
        this.duration_Minutes = duration_Minutes;
    }

    public String getAppointment_Types() {
        return appointment_Types;
    }

    public void setAppointment_Types(String appointment_Types) {
        this.appointment_Types = appointment_Types;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason_for_Visit() {
        return reason_for_Visit;
    }

    public void setReason_for_Visit(String reason_for_Visit) {
        this.reason_for_Visit = reason_for_Visit;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getCreated_Date() {
        return created_Date;
    }

    public void setCreated_Date(String created_Date) {
        this.created_Date = created_Date;
    }

    public String getDate_Modified() {
        return date_Modified;
    }

    public void setDate_Modified(String date_Modified) {
        this.date_Modified = date_Modified;
    }
    public static Appointments fromCVS(String[] element) {
        return new Appointments(element[0], element[1], element[2], element[3],
                element[4], element[5], element[6] , element[7], element[8],
                element[9], element[10], element[11], element[12]);
    };
    public String toCSV() {
        return appointment_ID + "," + patient_ID + "," + clinician_ID  + "," + facility_ID + "," + appointment_Date
                + "," + appointment_Time + "," + duration_Minutes + "," + appointment_Types + "," + status + "," + reason_for_Visit
                 + "," + notes + "," +created_Date +","+date_Modified;
    }



}





