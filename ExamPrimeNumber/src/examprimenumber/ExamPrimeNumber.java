
package examprimenumber;

import java.util.Scanner;

public class ExamPrimeNumber {


    public static void main(String[] args) {
      
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int userInput = s.nextInt();
        
        int count = 0;
        
        for(int i = 1; i<= userInput; i++){
            if(userInput % i ==0){
                count++;
            }
        }
        
        if(count==2){
            System.out.println(userInput + "  prime");
        }
        else{
             System.out.println(userInput + " not prime");
        }
    }
    
}
    
