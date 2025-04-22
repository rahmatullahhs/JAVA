
package sumpositive;

import java.util.Scanner;


public class SumPositive {

 
    public static void main(String[] args) {
       
        int counter=0;
    Scanner sc=new Scanner(System.in);
    
    int number=sc.nextInt();
    
    while(number>=0){
      counter=counter+number;
      number=sc.nextInt();
    }
    System.out.println(counter);
    
  }
    }
    

