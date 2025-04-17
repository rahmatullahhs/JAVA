
package factorial;

import java.util.Scanner;

public class Factorial {


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
