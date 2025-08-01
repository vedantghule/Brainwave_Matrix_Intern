package hospital.management.patients;

public class Patient {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String contact;

    public Patient(int id, String name, int age, String gender, String contact) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age +
                ", Gender: " + gender + ", Contact: " + contact);
    }

    public int getId() {
        return id;
    }
}
