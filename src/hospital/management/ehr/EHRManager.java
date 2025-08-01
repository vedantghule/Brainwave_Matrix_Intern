package hospital.management.ehr;

import java.util.ArrayList;
import java.util.Scanner;

public class EHRManager {
    private ArrayList<EHR> ehrRecords = new ArrayList<>();
    private int nextId = 1;
    Scanner sc = new Scanner(System.in);

    public void addEHR() {
        try {
            System.out.print("Enter Patient ID: ");
            int patientId = Integer.parseInt(sc.nextLine());
            System.out.print("Enter Diagnosis: ");
            String diagnosis = sc.nextLine();
            System.out.print("Enter Treatment: ");
            String treatment = sc.nextLine();
            System.out.print("Enter Prescription: ");
            String prescription = sc.nextLine();
            System.out.print("Enter Notes: ");
            String notes = sc.nextLine();

            EHR record = new EHR(nextId++, patientId, diagnosis, treatment, prescription, notes);
            ehrRecords.add(record);
            System.out.println("EHR record added successfully.");
        } catch (Exception e) {
            System.out.println("Error adding EHR: " + e.getMessage());
        }
    }

    public void viewEHRs() {
        if (ehrRecords.isEmpty()) {
            System.out.println("No EHR records available.");
        } else {
            for (EHR e : ehrRecords) {
                e.display();
            }
        }
    }

    public void viewEHRByPatientId() {
        System.out.print("Enter Patient ID: ");
        int patientId = Integer.parseInt(sc.nextLine());

        boolean found = false;
        for (EHR e : ehrRecords) {
            if (e.getPatientId() == patientId) {
                e.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No records found for Patient ID: " + patientId);
        }
    }
}
