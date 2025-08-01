package hospital.management.appointments;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class AppointmentManager {
    private ArrayList<Appointment> appointments = new ArrayList<>();
    private int nextId = 1;
    Scanner sc = new Scanner(System.in);

    public void scheduleAppointment() {
        try {
            System.out.print("Enter Patient ID: ");
            int patientId = Integer.parseInt(sc.nextLine());
            System.out.print("Enter Doctor's Name: ");
            String doctorName = sc.nextLine();
            System.out.print("Enter Appointment Date and Time (dd-MM-yyyy HH:mm): ");
            String dateTimeStr = sc.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, formatter);

            Appointment appt = new Appointment(nextId++, patientId, doctorName, dateTime);
            appointments.add(appt);
            System.out.println("Appointment Scheduled Successfully.");
        } catch (Exception e) {
            System.out.println("Invalid input format. Please try again.");
        }
    }

    public void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
        } else {
            for (Appointment a : appointments) {
                a.display();
            }
        }
    }
}
