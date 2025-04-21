package examfibonaccinumber;

import java.util.Scanner;

public class ExamFibonacciNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int input = s.nextInt();

        int number1 = 0;
        int number2 = 1;
        int number3;

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
