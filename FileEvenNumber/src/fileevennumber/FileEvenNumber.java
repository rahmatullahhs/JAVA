package fileevennumber;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileEvenNumber {

    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("c:\\Users\\Admin\\Desktop\\Shatee.txt");
        File g = new File("c:\\Users\\Admin\\Desktop\\Shatee2.txt");
       
       // f=new File("c:\\Users\\Admin\\Desktop\\Even.txt");;
        

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your limit: ");
        int l = s.nextInt();|
        
        PrintWriter pw = new PrintWriter(f);
        
        
        
        
//        PrintWriter pw = new PrintWriter(g);

        for (int i = 1; i <= l; i++) {
            if (i % 2 == 0) {
                pw.println(i);
            }
        }
        System.out.println("Your file created successfully.");
        pw.close();

    }

}
