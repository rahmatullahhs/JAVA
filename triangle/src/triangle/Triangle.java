/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangle;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
        float land;
       float height;
      
       Scanner s=new Scanner(System.in);
        System.out.println("enter land size");
        land=s.nextFloat();
        System.out.println("enter height size");
        height=s.nextFloat();
        
        float area = (float) (.5*(land * height));
        
        System.out.println(area);
    }
    
}
