package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int input = scan.nextInt();

        int number1 = 0;
        int number2 = 1;
        int number3=0;
        System.out.println(number1);
        System.out.println(number2);

        for (int i = 3; i <= input; i++) {
             number3 = number1 + number2;
            System.out.println(number3);
            
            number1 = number2;
            number2 = number3;

        }

    }

}
