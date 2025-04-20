
package examfiboprimemax;

import java.util.Arrays;
import java.util.Scanner;


public class ExamFiboPrimeMax {


    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
//        fibonacci




//        System.out.println("Enter limit :");
//        int size = s.nextInt();
//        System.out.println("-------------------------------");
//       
//        int number1=0;
//        int number2=1;
//        int sum=0;
//        System.out.println(number1);
//        System.out.println(number2);
//        
//         for(int i=3; i<=size; i++){
//            sum= number1+number2;
//            System.out.println(sum);
//            
//            number1 = number2;
//            number2 = sum;        
//        }
//    
        
//     prime   
        
        
             Scanner scan = new Scanner(System.in);
        
        System.out.print("input number to find prime number: ");
        int input = scan.nextInt();
        
        int count = 0;
        
        for(int i = 1; i<=input; i++){
            if(input%i==0){
                count++;
            }
        }
        
       if(count==2){
           System.out.println(input + " prime.");
       }
       else{
           System.out.println(input + " not prime.");
       }
         
         
         
         
         
         
         
         
         
         
         
         
        
        
        
        
        
        
        
    }
    
}
