
package pkg2darray;


import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        
        Scanner s =new Scanner(System.in);
        System.out.println("Enter row size");
        int rowSize=s.nextInt();
        
          System.out.println("Enter col size");
           int colSize=s.nextInt();
           
                   int[][] userArrays=new int[rowSize][colSize];       
 
                   for(int row=0; row<userArrays.length; rowSize++ ){
                    
                       for (int col =0;col<userArrays[rowSize].length;colSize++){
                           System.out.println("enter value for row "+(rowSize+1)+"colmon"+(colSize=1)+":" );
                   
                   userArrays[rowSize][colSize]=s.nextInt();
                       }
        
                   }
                   
      System.out.println("Your array is: ");
        
        
        for(int row=0; row<userArrays.length;row++ ){
        
        for(int col=0; col<userArrays[row].length;col++){
              System.out.print(userArrays[row][col] + " ");
             
        }
            System.out.println("\n");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
        }
        
        
        
        
        
        
        
    
    

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    
}
