
package maxmin5number;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin5Number {

    public static void main(String[] args) {
      
        Scanner s =new Scanner(System.in);
        
        System.out.println("limit");
        int size=s.nextInt();
        
        int[]numbers=new int[size];
        System.out.println(Arrays.toString(numbers);
        
       
          
//        int maxNumber= 0;
//        int minNumber=9999;
        
        
        
        for(int index=0;index<size;index++){
        
            System.out.println("enter num"+index+1);
            int userInput=s.nextInt();
            numbers[index]=userInput;
        }
        
        System.out.println(Arrays.toString(numbers));
      
        
        int maxNumber= numbers[0];
        int minNumber=numbers[0];
        
        for(int number :numbers ){
        
            if(number > maxNumber){
            maxNumber = number;
            }
        
             if(number < minNumber){
            minNumber = number;
            }

        }
        
          System.out.println(maxNumber);
           System.out.println(minNumber);
        
        
        
      
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
        
        
        
        
        
        
//    1  -----------------  
    }
// 2 ---------------------------  
}
