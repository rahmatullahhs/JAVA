
package details;


public class Student extends person{
    
    int studentId;

    public Student() {
    }

    public Student(int studentId) {
        this.studentId = studentId;
    }

    public Student(int studentId, String name, int age) {
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }



    @Override
    public void getStudentDetails() {
        super.getStudentDetails(); 
        System.out.println("student id:" + studentId);
    }

    void studentDetails() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    
    
    
    
    
}
