package hospital.management.billing;

import java.util.ArrayList;
import java.util.Scanner;

public class BillingManager {
    private ArrayList<Invoice> invoices = new ArrayList<>();
    private int nextInvoiceId = 1;
    Scanner sc = new Scanner(System.in);

    public void createInvoice() {
        System.out.print("Enter Patient ID: ");
        int patientId = Integer.parseInt(sc.nextLine());
        Invoice invoice = new Invoice(nextInvoiceId++, patientId);

        while (true) {
            System.out.print("Enter Service Description: ");
            String service = sc.nextLine();
            System.out.print("Enter Service Cost (₹): ");
            double cost = Double.parseDouble(sc.nextLine());

            invoice.addService(service, cost);

            System.out.print("Add another service? (yes/no): ");
            String more = sc.nextLine();
            if (!more.equalsIgnoreCase("yes")) break;
        }

        invoices.add(invoice);
        System.out.println("Invoice created successfully!");
    }

    public void viewAllInvoices() {
        if (invoices.isEmpty()) {
            System.out.println("No invoices available.");
        } else {
            for (Invoice i : invoices) {
                i.display();
            }
        }
    }

    public void viewInvoiceByPatientId() {
        System.out.print("Enter Patient ID: ");
        int patientId = Integer.parseInt(sc.nextLine());
        boolean found = false;
        for (Invoice i : invoices) {
            if (i.getPatientId() == patientId) {
                i.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No invoices found for Patient ID: " + patientId);
        }
    }
}
