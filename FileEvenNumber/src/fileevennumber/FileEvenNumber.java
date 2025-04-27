package fileevennumber;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileEvenNumber {

    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("c://Users//Admin//Desktop//Even.txt");
        String result = "";

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your limit: ");
        int l = s.nextInt();

        for (int i = 1; i < l; i++) {
            if (i % 2 == 0) {
                result += i + ", ";
            }
        }

        System.out.println("Your file created successfully.");
        PrintWriter pw = new PrintWriter(f);
        pw.print(result);
        pw.close();

    }

}
