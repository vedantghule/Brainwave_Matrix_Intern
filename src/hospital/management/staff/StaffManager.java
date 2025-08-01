package hospital.management.staff;

import java.util.ArrayList;
import java.util.Scanner;

public class StaffManager {
    private ArrayList<Staff> staffList = new ArrayList<>();
    private int nextId = 1;
    Scanner sc = new Scanner(System.in);

    public void addStaff() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Role (Doctor, Nurse, Admin, etc.): ");
        String role = sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();
        System.out.print("Enter Contact: ");
        String contact = sc.nextLine();

        Staff s = new Staff(nextId++, name, role, dept, contact);
        staffList.add(s);
        System.out.println("Staff added successfully.");
    }

    public void viewAllStaff() {
        if (staffList.isEmpty()) {
            System.out.println("No staff records available.");
        } else {
            for (Staff s : staffList) {
                s.display();
            }
        }
    }

    public void viewByRole() {
        System.out.print("Enter role to filter (e.g. Doctor): ");
        String role = sc.nextLine();
        boolean found = false;

        for (Staff s : staffList) {
            if (s.getRole().equalsIgnoreCase(role)) {
                s.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No staff found for role: " + role);
        }
    }
}
