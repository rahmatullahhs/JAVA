package javaapplication61;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication61 {

 

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("What you want to do?(Read/Write): ");
            String userChoice = scan.nextLine();

            if (userChoice.equalsIgnoreCase("Write")) {
                System.out.print("Enter your file name: ");
                String fileName = scan.nextLine();

                System.out.print("Enter your text: ");
                String userInput = scan.nextLine();

                File f = new File("C:\\Users\\Admin\\Desktop\\" + fileName + ".txt");
                try (PrintWriter pw = new PrintWriter(f)) {
                    pw.println(userInput);
                    System.err.println("your file created successfully.");
                }
            } 
            else if (userChoice.equalsIgnoreCase("Read")) {
                
                System.out.print("Enter your file name: ");
                String fileName = scan.nextLine();
                
                File f = new File("C:\\Users\\Admin\\Desktop\\" + fileName + ".txt");
                Scanner read = new Scanner(f);
                System.out.println("Your text: " + read.nextLine());
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClassTestInoutOutput.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}