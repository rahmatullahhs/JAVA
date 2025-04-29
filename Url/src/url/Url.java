
package url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;
public class Url {

  
    public static void main(String[] args) {

 
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Web Address: ");
        String userURL = s.next();
        System.out.print("Enter File Name: ");
        String fileName = s.next();
 
        try {
            URL url = new URL("https://" + userURL);
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String line;
                String result = "";
                try (PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\Desktop"+fileName+".html")) {
                    while ((line = reader.readLine()) != null) {
                        result += line;
                    }
                    pw.println(result);
                    System.out.println("File Created Successfully.");
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
    
