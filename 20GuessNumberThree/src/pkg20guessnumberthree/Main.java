package pkg20guessnumberthree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
//        int randomNumber = (int) (Math.random() * 10);
//        int userInput = s.nextInt();
//        int count = 1;
//        while (count < 3) {
//
//            if (randomNumber == userInput) {
//                System.out.println("win");
//                 break;
//            }
//           
//        
//        else if(randomNumber < userInput){
//                System.out.println("try again");
//                
//                 userInput=s.nextInt();
//                }
//        
//        else if(randomNumber > userInput){
//                System.out.println("try again");
//                
//                 userInput=s.nextInt();
//                }
//
//        if (count == 2) {
//            System.out.println("lose");
//        }
//
//        count++;
//}

        
        
       

    int input;
    int count =1;
    long factorial=1;
    
        System.out.println("enter value");
    input=s.nextInt();
    
    if (input<0){
        System.out.println("enter positive number");}
    else{
    do{
    factorial*=count;
    count++;
    }
    while(
            count<= input);
    
    
    }
        System.out.println("answer is " + factorial);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

}
