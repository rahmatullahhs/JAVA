/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;

import java.util.Scanner;

/**
   * @author Admin
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
                 Scanner s = new Scanner(System.in);

        System.out.println("Enter a number to check even or odd");
        int number = s.nextInt();
       
        if(number % 2 == 0){
            System.out.println(number + " is the even number");
        }
        
        else{
            System.out.println(number + " is the odd number");
        
        }
    }
    
}
