package Model;

public class Prescriptions {
    private String prescription_ID;
    private String patient_ID;
    private String clinician_ID;
    private String appointment_ID;
    private String prescription_Date;
    private String medication_Name;
    private String medication_Dosage;
    private String frequency;
    private String duration_Days;
    private String medication_Quantity;
    private String instructions;
    private String pharmacy_Name;
    private String status;
    private String issue_Date;
    private String collection_Date;

    public Prescriptions(String prescription_ID, String patient_ID, String clinician_ID, String appointment_ID,
                         String prescription_Date, String medication_Name, String medication_Dosage, String frequency,
                         String duration_Days, String medication_Quantity, String instructions, String pharmacy_Name,
                         String status, String issue_Date, String collection_Date) {

        this.prescription_ID = prescription_ID;
        this.patient_ID = patient_ID;
        this.clinician_ID = clinician_ID;
        this.appointment_ID = appointment_ID;
        this.prescription_ID = prescription_ID;
        this.prescription_Date = prescription_Date;
        this.medication_Name = medication_Name;
        this.medication_Dosage = medication_Dosage;
        this.frequency = frequency;
        this.duration_Days = duration_Days;
        this.medication_Quantity = medication_Quantity;
        this.instructions = instructions;
        this.pharmacy_Name = pharmacy_Name;
        this.status = status;
        this.issue_Date = issue_Date;
        this.collection_Date = collection_Date;

    }

    public String getPrescription_ID() {
        return prescription_ID;
    }

    public void setPrescription_ID(String prescription_ID) {
        this.prescription_ID = prescription_ID;
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

    public String getAppointment_ID() {
        return appointment_ID;
    }

    public void setAppointment_ID(String appointment_ID) {
        this.appointment_ID = appointment_ID;
    }

    public String getPrescription_Date() {
        return prescription_Date;
    }

    public void setPrescription_Date(String prescription_Date) {
        this.prescription_Date = prescription_Date;
    }

    public String getMedication_Name() {
        return medication_Name;
    }

    public void setMedication_Name(String medication_Name) {
        this.medication_Name = medication_Name;
    }

    public String getMedication_Dosage() {
        return medication_Dosage;
    }

    public void setMedication_Dosage(String medication_Dosage) {
        this.medication_Dosage = medication_Dosage;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getDuration_Days() {
        return duration_Days;
    }

    public void setDuration_Days(String duration_Days) {
        this.duration_Days = duration_Days;
    }

    public String getMedication_Quantity() {
        return medication_Quantity;
    }

    public void setMedication_Quantity(String  medication_Quantity) {
        this.medication_Quantity = medication_Quantity;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getPharmacy_Name() {
        return pharmacy_Name;
    }

    public void setPharmacy_Name(String pharmacy_Name) {
        this.pharmacy_Name = pharmacy_Name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIssue_Date() {
        return issue_Date;
    }

    public void setIssue_Date(String issue_Date) {
        this.issue_Date = issue_Date;
    }

    public String getCollection_Date() {
        return collection_Date;
    }

    public void setCollection_Date(String collection_Date) {
        this.collection_Date = collection_Date;
    }

    public static Prescriptions fromCVS(String[] element) {
        return new Prescriptions(element[0], element[1], element[2], element[3],
                element[4], element[5], element[6], element[7], element[8],
                element[9], element[10], element[11], element[12], element[13],
                element[14]);
    };
    public String toCSV() {
        return prescription_ID + "," + patient_ID + "," + clinician_ID + "," + appointment_ID + "," + appointment_ID
                + "," + prescription_Date + "," + medication_Name + "," + medication_Dosage + "," + frequency + "," +
                duration_Days + "," + medication_Quantity + "," + instructions + "," + pharmacy_Name + "," + status
                + "," + issue_Date + "," + collection_Date;


    }



}

