/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circal.calculate.by.pkgif.pkgelse;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CircalCalculateByIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
          
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Radius");
   double radius=s.nextDouble();
   double area ;
  if ( radius <= 0){  
       System.out.println("Enter positive number");
           radius=s.nextDouble() ;
    area = Math.PI * radius * radius;

  }
  else{       
      area = Math.PI * radius * radius;

 }
 System.out.println(area);
        
        
        
        
        
        
        
        
        
    }
    
}
