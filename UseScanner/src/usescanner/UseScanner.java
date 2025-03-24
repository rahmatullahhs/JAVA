/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usescanner;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class UseScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
    
        Scanner input=new Scanner(System.in);
        System.out.print("enter 1st number");
        int number1=input.nextInt();
           System.out.print("enter 2st number");
        int number2=input.nextInt();
        
//        int result=number1+number2;
//                   System.out.print(result);

        
         float result=(float)number1/number2;
                   System.out.print("answer "+result+"    ");
        
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number");
        
        
        
        
        
        
    }
    
}
