package hospital.management.appointments;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Appointment {
    private int appointmentId;
    private int patientId;
    private String doctorName;
    private LocalDateTime appointmentDateTime;

    public Appointment(int appointmentId, int patientId, String doctorName, LocalDateTime appointmentDateTime) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorName = doctorName;
        this.appointmentDateTime = appointmentDateTime;
    }

    public void display() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        System.out.println("Appointment ID: " + appointmentId + ", Patient ID: " + patientId +
                ", Doctor: " + doctorName + ", Date & Time: " + appointmentDateTime.format(formatter));
    }

    public int getPatientId() {
        return patientId;
    }
}
