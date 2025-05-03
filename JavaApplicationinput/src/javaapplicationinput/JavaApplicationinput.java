

package javaapplicationinput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class JavaApplicationinput {

 
    
    public static void main(String[] args) {
        
         File f =new File("C:\\Users\\Admin\\Desktop\\rahmat.txt");
        
        try {
            PrintWriter pw=new PrintWriter(f);
            pw.append("apple");
            pw.print("egg");
            pw.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaApplicationinput.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Scanner s= new Scanner(f);
            System.out.println(s.nextLine());
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaApplicationinput.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
