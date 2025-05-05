package fibonakki.number;

import java.util.Scanner;

public class FibonakkiNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int input = s.nextInt();

        int x = 0;
        int y = 1;

       
        for (int i = 0; i < input; i++) {
            System.out.print(x + " ");
            int next = x + y;
            x = y;
            y = next;
             
        }
       
    }

}
