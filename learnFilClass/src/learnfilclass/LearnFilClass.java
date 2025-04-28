
package learnfilclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class LearnFilClass {

    
    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("c://Users//Admin//Desktop//even.txt");
        java.io.File file = new java.io.File("scores.txt");
       
 if (file.exists()) {
        System.out.println("File already exists");
        System.exit(1);
 }
        try (PrintWriter pw = new PrintWriter(f)) {
            pw.print("My brain is not Braining");
        }
        
        
        
        
        
        
        
        
        
     





    }
    
}
