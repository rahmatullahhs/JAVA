
package inputfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Inputfile {

   
    public static void main(String[] args) {
       
        
        File f =new File("C:\\Users\\Admin\\Desktop\\hello.txt");
        
        try {
            PrintWriter pw=new PrintWriter(f);
            pw.write("Welcome to java world");
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Inputfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner s = null;
        try {
            s = new Scanner(f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Inputfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(s.nextLine());
  
    }
    
}
