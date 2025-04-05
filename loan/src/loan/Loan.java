/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loan;

import java.util.Scanner;


public class Loan {


    public static void main(String[] args) {

        
        
        
        
        Scanner s=new Scanner(System.in);
        System.out.println("enter interest rate as 12.5%");
        double interestRate=s.nextDouble();
        double monthlyInterestRate=interestRate/1200;
        
        System.out.println("enter number of year");
        int numberOfYear=s.nextInt();
        
        System.out.println("Enter loan amount");
        double LoanAmount=s.nextDouble();
        
        double monthlyPayment = LoanAmount * monthlyInterestRate /(1
                -1/Math.pow(1+ monthlyInterestRate, numberOfYear * 12));
        
        double totalPayment=monthlyPayment*numberOfYear*12;
        
         System.out.println("The monthly payment is $" + (int) monthlyPayment );
       System.out.println("The total payment is $" + (int)totalPayment);
       
       
       
        
    }
    
}
