
package fibonacci;

import java.util.Scanner;


public class Fibonacci {


    public static void main(String[] args) {
 
       Scanner s =new Scanner(System.in);
        
        System.out.println("limit");
        int size=s.nextInt();
        
        int number1=0;
        int number2=1;
        int sum=0;
        
        System.out.println(number1);
        System.out.println(number2);
        
        for(int i = 3; 1<= size;i++){
        
        sum=number1+number2;
                System.out.println(sum);
                        
        
        }
        
        
       
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
}
