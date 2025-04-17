/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 Scanner s =new Scanner(System.in);
        
        System.out.println("limit");
        int input=s.nextInt();
        int facto=1;
        
         for(int i = 1; 1<= input;i++){
       facto*=i;

         }

        System.out.println(facto);













// TODO code application logic here
    }
    
}
