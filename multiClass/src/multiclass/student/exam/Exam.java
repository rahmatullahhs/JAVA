
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
    
<<<<<<< Updated upstream
        System.out.println("Subject name: "+ this.Subject+"\n mark :" + this.Mark+ "\n attendance:" + this.Attendence+"\n");
     }
=======
        System.out.println("Subject name: "+ this.Subject+"\n mark :" + this.Mark+ "\n attendance:" + this.Attendence);
    
    
    
    
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public int getMark() {
        return Mark;
    }

    public void setMark(int Mark) {
        this.Mark = Mark;
    }

    public String getAttendence() {
        return Attendence;
    }

    public void setAttendence(String Attendence) {
        this.Attendence = Attendence;
    }
>>>>>>> Stashed changes
    
    
    
    
    
    
}
