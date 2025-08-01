package hospital.management.ehr;

public class EHR {
    private int ehrId;
    private int patientId;
    private String diagnosis;
    private String treatment;
    private String prescription;
    private String notes;

    public EHR(int ehrId, int patientId, String diagnosis, String treatment, String prescription, String notes) {
        this.ehrId = ehrId;
        this.patientId = patientId;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.prescription = prescription;
        this.notes = notes;
    }

    public int getPatientId() {
        return patientId;
    }

    public void display() {
        System.out.println("EHR ID: " + ehrId +
                "\nPatient ID: " + patientId +
                "\nDiagnosis: " + diagnosis +
                "\nTreatment: " + treatment +
                "\nPrescription: " + prescription +
                "\nNotes: " + notes + "\n");
    }
}