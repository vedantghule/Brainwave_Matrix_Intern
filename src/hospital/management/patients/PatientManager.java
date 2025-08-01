package hospital.management.patients;

import java.util.ArrayList;
import java.util.Scanner;

public class PatientManager {
    private ArrayList<Patient> patients = new ArrayList<>();
    private int nextId = 1;
    Scanner sc = new Scanner(System.in);

    public void registerPatient() {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Enter gender: ");
        String gender = sc.nextLine();
        System.out.print("Enter contact: ");
        String contact = sc.nextLine();

        Patient p = new Patient(nextId++, name, age, gender, contact);
        patients.add(p);
        System.out.println("Patient Registered Successfully.");
    }

    public void viewPatients() {
        for (Patient p : patients) {
            p.display();
        }
    }
}
