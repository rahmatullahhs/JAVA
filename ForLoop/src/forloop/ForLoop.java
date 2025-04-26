package forloop;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
//prime number
        System.out.println("enter number");
        int input = s.nextInt();

        int count = 0;
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println(input + " prime");
        } else {
            System.out.println("not prime");
        }
//number sequence
//System.out.println("how much sequence you want to see");
//        int userInput = s.nextInt();
//        for (int i = 1; i <= userInput; i++) {
//            System.out.println(i + " sequence");
//        }

    }

}
