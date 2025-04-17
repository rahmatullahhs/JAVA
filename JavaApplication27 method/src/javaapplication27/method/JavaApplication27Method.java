
package javaapplication27.method;

import java.util.Arrays;


public class JavaApplication27Method {


    public static void main(String[] args) {
   
    
        
        System.out.println("limit");
    
        
        
        
    }
    
    
    
    
    
    
     public static  String MaxMin( int size) {
   
       
        
        
        int[]numbers=new int[size];
 
   
        for(int index=0;index < size ;index++){
        
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
         }
}

}
