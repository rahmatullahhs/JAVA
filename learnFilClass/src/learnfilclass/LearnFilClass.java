package learnfilclass;

import java.io.FileNotFoundException;
import java.io.PrintWriter;



public class LearnFilClass {

 
    public static void main(String[] args) throws FileNotFoundException  {

       
   
        try (PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\Desktop\\lelo.txt")) {
            pw.print("without try case but throw");
        }
 
 }
}