package hospital.management.staff;

public class Staff {
    private int staffId;
    private String name;
    private String role;
    private String department;
    private String contact;

    public Staff(int staffId, String name, String role, String department, String contact) {
        this.staffId = staffId;
        this.name = name;
        this.role = role;
        this.department = department;
        this.contact = contact;
    }

    public String getRole() {
        return role;
    }

    public void display() {
        System.out.println("Staff ID: " + staffId +
                ", Name: " + name +
                ", Role: " + role +
                ", Department: " + department +
                ", Contact: " + contact);
    }
}
