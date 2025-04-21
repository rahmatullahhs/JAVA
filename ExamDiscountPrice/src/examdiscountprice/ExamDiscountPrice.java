
package examdiscountprice;

import java.util.Scanner;


public class ExamDiscountPrice {

    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        
        double userPay=s.nextDouble();
     double discountPrice = userPay -(userPay * 0.05);
        if (userPay > 200 ) {
        
          System.out.println("Actual price :" + userPay +" Discount price:" + discountPrice);
        }
        else{  System.out.println("Actual price :" + userPay +" no price: 00");
        }
      
     
        
    }
    
}
