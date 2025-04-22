
package multiclass.student.exam;


public class Exam {
    
    String Subject;
    int Mark;
    String Attendence;

    public Exam() {
    }

    public Exam(String Subject, int Mark, String Attendence) {
        this.Subject = Subject;
        this.Mark = Mark;
        this.Attendence = Attendence;
    }
    
    
    public void getExamDtails(){
    
        System.out.println("Subject name: "+ this.Subject+"\n mark :" + this.Mark+ "\n attendance:" + this.Attendence);
    
    
    
    
    }
    
    
    
    
    
    
}
