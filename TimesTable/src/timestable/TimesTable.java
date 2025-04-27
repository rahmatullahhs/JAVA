package timestable;

import java.util.Scanner;

public class TimesTable {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

//        
//        for (int i = 1; i <= 10; i++) {
//            int result = userInput * i;
//            System.out.println(userInput + "*" + i + "=" + result);
//
//        }


        int sum = 0;

        for (;;) {
            System.out.println("Enter  number");
            int userInput = s.nextInt();

            if (userInput < 0) {
                System.out.println("enter positive intger");
                break;
            }
            else{ sum += userInput;}

        }
        System.out.println(sum +" reza ");

    }

}
