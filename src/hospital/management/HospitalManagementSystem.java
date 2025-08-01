package hospital.management;

import hospital.management.appointments.AppointmentManager;
import hospital.management.patients.PatientManager;
import hospital.management.ehr.EHRManager;
import hospital.management.billing.BillingManager;
import hospital.management.inventory.InventoryManager;
import hospital.management.staff.StaffManager;

import java.util.Scanner;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        System.out.println("--------------Welcome to the Hospital Management System---------------");

        Scanner sc = new Scanner(System.in);
        PatientManager pm = new PatientManager();
        EHRManager ehrm = new EHRManager();
        BillingManager bm = new BillingManager();
        InventoryManager im = new InventoryManager();
        StaffManager sm = new StaffManager();

        AppointmentManager am = new AppointmentManager();

        while (true) {
            System.out.println("\n================= HOSPITAL MANAGEMENT ==================");
            System.out.println("1. Register Patient");
            System.out.println("2. View Patients ");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View Appointment");
            System.out.println("5. Add EHR");
            System.out.println("6. View All EHRs");
            System.out.println("7. View EHR by Patient ID");
            System.out.println("8. Create Invoice");
            System.out.println("9. View All Invoices");
            System.out.println("10. View Invoice by Patient ID");
            System.out.println("11. Add Inventory Item");
            System.out.println("12. View Inventory");
            System.out.println("13. Update Inventory");
            System.out.println("14. Add Staff");
            System.out.println("15. View All Staff");
            System.out.println("16. View Staff by Role");
            System.out.println("17. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    pm.registerPatient();
                    break;

                case 2:
                    pm.viewPatients();
                    break;

                case 3:
                    am.scheduleAppointment();
                    break;

                case 4:
                    am.viewAppointments();
                    break;

                case 5:
                    ehrm.addEHR();
                    break;

                case 6:
                    ehrm.viewEHRs();
                    break;

                case 7:
                    ehrm.viewEHRByPatientId();
                    break;

                case 8:
                    bm.createInvoice();
                    break;

                case 9:
                    bm.viewAllInvoices();
                    break;

                case 10:
                    bm.viewInvoiceByPatientId();
                    break;

                case 11:
                    im.addItem();
                    break;

                case 12:
                    im.viewInventory();
                    break;

                case 13:
                    im.updateStock();
                    break;

                case 14:
                    sm.addStaff();
                    break;

                case 15:
                    sm.viewAllStaff();
                    break;

                case 16:
                    sm.viewByRole();
                    break;

                case 17:{
                    System.out.println("Thank you! Exiting system...");
                    System.exit(0);
                }
                default:
                    System.out.println("Enter Valid choice !");
            }

        }
    }
}
