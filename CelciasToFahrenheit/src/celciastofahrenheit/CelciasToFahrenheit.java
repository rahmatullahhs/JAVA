/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package celciastofahrenheit;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CelciasToFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
 
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Celsius (Integer Number Only): ");
        if (scan.hasNextInt()) {
            int input = scan.nextInt();
            int result = input * 9 / 5 + 32;
            System.out.println(input + " Celsius is " + result + " Fahrenheit");
        } else {
            System.out.println("Please enter a integer number");
            
            
            
            
        }

    }
} 
    
    

