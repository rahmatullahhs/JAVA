/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           Scanner s = new Scanner(System.in);
         System.out.println("Enter a year to check Leap Year");
     int year = s.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is Leap Year");
                } else {
                    System.out.println(year + " not Leap Year");
                }

            } else {
                System.out.println(year + " Leap Year");
            }
        } else {
            System.out.println(year + " is not Leap Year");
        }
    }

        
        
        
        
        
        
        
        
    }
    

