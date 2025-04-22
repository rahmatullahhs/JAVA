package multiclass.student;

public class Student {

    private String name;
    private String email;
    private int id;
    private double contact;
    private String address;

    public Student() {
    }

    public Student(String name, String email, int id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public Student(String name, String email, int id, double contact, String Address) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.contact = contact;
        this.address = Address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 6 && name.length() <= 20) {
            this.name = name;
        } else {
            this.name = "Invalid name";
            System.err.println("Name must be 6-20 charecters");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getContact() {
        return contact;
    }

    public void setContact(double contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String Address) {
        this.address = Address;
    }

    public void getStudentDetails() {
        System.out.println("Name: " + this.name + "\n"
                + "Email: " + this.email + "\n"
                + "ID: " + this.id + "\n"
                + "Contact: " + this.contact + "\n"
                + "Address: " + this.address + "\n"
        );
    }

}
