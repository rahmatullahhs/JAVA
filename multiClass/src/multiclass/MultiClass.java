package multiclass;

import multiclass.student.Student;
import multiclass.student.exam.Exam;

public class MultiClass {

    public static void main(String[] args) {
        
        Exam exam = new Exam("Java", 500, "5");

        Student student = new Student("Rahmat Ullah", "rahmatullah@gmail.com", 1287480, 1865459, "Dhaka, Bangladesh");
        
        
        
//        ("Easin Prodhan", "rahmatullah@gmail.com", 1287480, 1865459, "Dhaka, Bangladesh");
//        student.getStudentDetails();
        student.getStudentDetails();
        
        exam.getExamDtails();
        
        
        
        
        
    }

}
