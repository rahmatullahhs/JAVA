
package numberguessgame;

import java.util.Scanner;

public class NumberGuessGame {

    public static void main(String[] args) {
      
        Scanner scan=new Scanner(System.in);
        
        int randomNumberGenerator=(int) (Math.random()*10);
        int userInput=scan.nextInt();
        int count =1;
        
        while (count<3) {            
            
            if(randomNumberGenerator==userInput){
                System.out.println("win");
            break;
            } else if(randomNumberGenerator < userInput){
                System.out.println("try again");
                userInput =scan.nextInt();
             }else if (randomNumberGenerator>userInput) {
                System.out.println("try again");
                userInput=scan.nextInt();
            }if(count==2){
                System.out.println("lose");
            }
            count++;
        }
        

        
    }
    
}
