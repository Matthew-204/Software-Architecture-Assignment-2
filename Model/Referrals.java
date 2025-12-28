package Model;

public class Referrals {
    private String referral_ID;
    private String patient_ID;
    private String referring_clinician_ID;
    private String referred_to_clinician_ID;
    private String referring_facility_ID;
    private String referring_to_facility_ID;
    private String referral_Date;
    private String urgency_Level;
    private String referral_Reason;
    private String clinical_Summary;
    private String requested_Investigation;
    private String status;
    private String appointment_ID;
    private String notes;
    private String created_Date;
    private String last_Updated;

    public Referrals(String referral_ID, String patient_ID, String referring_clinician_ID,
                     String referred_to_clinician_ID, String referring_facility_ID, String referring_to_facility_ID,
                     String referral_Date, String urgency_Level, String referral_Reason, String clinical_Summary,
                     String requested_Investigation, String status, String appointment_ID, String notes,
                     String created_Date, String last_Updated) {


        this.referral_ID = referral_ID;
        this.patient_ID = patient_ID;
        this.referring_clinician_ID = referring_clinician_ID;
        this.referred_to_clinician_ID = referred_to_clinician_ID;
        this.referring_facility_ID = referring_facility_ID;
        this.referring_to_facility_ID = referring_to_facility_ID;
        this.referral_Date = referral_Date;
        this.urgency_Level = urgency_Level;
        this.referral_Reason = referral_Reason;
        this.clinical_Summary = clinical_Summary;
        this.requested_Investigation = requested_Investigation;
        this.status = status;
        this.appointment_ID = appointment_ID;
        this.notes = notes;
        this.created_Date = created_Date;
        this.last_Updated = last_Updated;

    }

    public String getReferral_ID() {
        return referral_ID;
    }

    public void setReferral_ID(String referral_ID) {
        this.referral_ID = referral_ID;
    }

    public String getPatient_ID() {
        return patient_ID;
    }

    public void setPatient_ID(String patient_ID) {
        this.patient_ID = patient_ID;
    }

    public String getReferring_clinician_ID() {
        return referring_clinician_ID;
    }

    public void setReferring_clinician_ID(String referring_clinician_ID) {
        this.referring_clinician_ID = referring_clinician_ID;
    }

    public String getReferred_to_clinician_ID() {
        return referred_to_clinician_ID;
    }

    public void setReferred_to_clinician_ID(String referred_to_clinician_ID) {
        this.referred_to_clinician_ID = referred_to_clinician_ID;
    }

    public String getReferring_facility_ID() {
        return referring_facility_ID;
    }

    public void setReferring_facility_ID(String referring_facility_ID) {
        this.referring_facility_ID = referring_facility_ID;
    }

    public String getReferring_to_facility_ID() {
        return referring_to_facility_ID;
    }

    public void setReferring_to_facility_ID(String referring_to_facility_ID) {
        this.referring_to_facility_ID = referring_to_facility_ID;
    }

    public String getReferral_Date() {
        return referral_Date;
    }

    public void setReferral_Date(String referral_Date) {
        this.referral_Date = referral_Date;
    }

    public String getUrgency_Level() {
        return urgency_Level;
    }

    public void setUrgency_Level(String urgency_Level) {
        this.urgency_Level = urgency_Level;
    }

    public String getReferral_Reason() {
        return referral_Reason;
    }

    public void setReferral_Reason(String referral_Reason) {
        this.referral_Reason = referral_Reason;
    }

    public String getClinical_Summary() {
        return clinical_Summary;
    }

    public void setClinical_Summary(String clinical_Summary) {
        this.clinical_Summary = clinical_Summary;
    }

    public String getRequested_Investigation() {
        return requested_Investigation;
    }

    public void setRequested_Investigation(String requested_Investigation) {
        this.requested_Investigation = requested_Investigation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAppointment_ID() {
        return appointment_ID;
    }

    public void setAppointment_ID(String appointment_ID) {
        this.appointment_ID = appointment_ID;
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

    public String getLast_Updated() {
        return last_Updated;
    }

    public void setLast_Updated(String last_Updated) {
        this.last_Updated = last_Updated;
    }

    public static Referrals fromCVS(String[] element) {
        return new Referrals(element[0], element[1], element[2], element[3],
                element[4], element[5], element[6], element[7], element[8],
                element[9], element[10], element[11], element[12], element[13],
                element[14], element[15]);
        };
    public String toCSV() {
        return referral_ID + "," + patient_ID + "," + referring_clinician_ID + "," + referred_to_clinician_ID + "," +
                referring_facility_ID + "," + referring_to_facility_ID + "," + referral_Date + "," + urgency_Level
                + "," + referral_Reason + "," + clinical_Summary  + "," + requested_Investigation + "," + status + "," +
                appointment_ID + "," + notes + "," + created_Date + "," + last_Updated;
    }
}
