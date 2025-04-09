
package javaapplication14;

import java.util.Scanner;


public class JavaApplication14 {

    public static void main(String[] args) {

Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to check positive,negative or zero(0)");
        int num = s.nextInt();

        if (num > 0) {
            System.out.println(num + " is the positive number");

        } else if (num < 0) {
            System.out.println(num + " is the negative number");
        } else {
            System.out.println(num + " is zero");
        }
    }

}
