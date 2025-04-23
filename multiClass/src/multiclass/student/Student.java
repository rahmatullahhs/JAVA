package multiclass.student;

<<<<<<< Updated upstream
public class Student{
=======
import multiclass.student.exam.Exam;
>>>>>>> Stashed changes

public class Student extends Exam {

    public String name;
    protected String email;
    private int id;
    double contact;
    private String address;

<<<<<<< Updated upstream
    public Student() {
    }



    public Student(String name, String email, int id, double contact, String Address) {
=======
    public Student(String name, String email, int id, double contact, String address) {
>>>>>>> Stashed changes
        this.name = name;
        this.email = email;
        this.id = id;
        this.contact = contact;
        this.address = address;
    }

    public Student(String name, String email, int id, double contact, String address, String Subject, int Mark, String Attendence) {
        super(Subject, Mark, Attendence);
        this.name = name;
        this.email = email;
        this.id = id;
        this.contact = contact;
        this.address = address;
    }

    @Override
    public void getExamDtails() {
        super.getExamDtails(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
   }

    @Override
    public void setAttendence(String Attendence) {
        super.setAttendence(Attendence); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setSubject(String Subject) {
        super.setSubject(Subject); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setMark(int Mark) {
        super.setMark(Mark); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

   public void getStudentDetails(){
       System.out.println("name:" + this.name+ "email:"+this.email+"id: "+this.id+"contract; "+
               this.contact+"address:"+this.address);
   
   }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
