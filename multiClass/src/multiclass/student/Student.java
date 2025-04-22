
package multiclass.student;


public class Student {
    
   private String name;
   private  String email;
    private  int id;
    private  double contact;
    private  String Address;

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
        this.Address = Address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    
   
}
