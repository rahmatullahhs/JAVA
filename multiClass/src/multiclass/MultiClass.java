package multiclass;

import multiclass.student.Student;
import multiclass.student.exam.Exam;

public class MultiClass {
    
    public static void main(String[] args) {


        Exam exam1 = new Exam("Java", 500, "present");
        Exam exam2 = new Exam("Java", 200, "absent");

        Student student1 = new Student("Rahmat Ullah", "rahmatullah@gmail.com", 1287480, 1865459, "Dhaka, Bangladesh");
        Student student2 = new Student("Easin Prodhan", "rahmatullah@gmail.com", 1287480, 1865459, "Dhaka, Bangladesh")
        
        Exam exam = new Exam("Java", 500, "5");
        
        Student student = new Student("Rahmat Ullah", "rahmatullah@gmail.com", 1287480, 1865459, "Dhaka, Bangladesh");

//        ("Easin Prodhan", "rahmatullah@gmail.com", 1287480, 1865459, "Dhaka, Bangladesh");
//        student.getStudentDetails();
        student.getStudentDetails();
        
        student.setMark(55);
        student.setSubject("bangla");
        student.setAttendence("present");
        student.getExamDtails();

        
        student2.getStudentDetails();
        student1.getStudentDetails();

        exam1.getExamDtails();
        exam2.getExamDtails();
    }
    
}
