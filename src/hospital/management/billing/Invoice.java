package hospital.management.billing;

import java.util.ArrayList;

public class Invoice {
    private int invoiceId;
    private int patientId;
    private ArrayList<String> services;
    private ArrayList<Double> costs;
    private double totalAmount;

    public Invoice(int invoiceId, int patientId) {
        this.invoiceId = invoiceId;
        this.patientId = patientId;
        this.services = new ArrayList<>();
        this.costs = new ArrayList<>();
        this.totalAmount = 0;
    }

    public void addService(String service, double cost) {
        services.add(service);
        costs.add(cost);
        totalAmount += cost;
    }

    public int getPatientId() {
        return patientId;
    }

    public void display() {
        System.out.println("\nInvoice ID: " + invoiceId + ", Patient ID: " + patientId);
        System.out.println("Services:");
        for (int i = 0; i < services.size(); i++) {
            System.out.println(" - " + services.get(i) + ": ₹" + costs.get(i));
        }
        System.out.println("Total Amount: ₹" + totalAmount);
    }
}
