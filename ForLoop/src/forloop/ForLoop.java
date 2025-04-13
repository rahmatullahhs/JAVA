package forloop;

import com.sun.source.tree.ContinueTree;
import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

//        System.out.println("enter number");
//        int input = s.nextInt();
//
//        int count = 0;
//        for (int i = 1; i <= input; i++) {
//            if (input % i == 0) {
//                count++;
//            }
//        }
//        if (count == 2) {
//            System.out.println(input + " prime");
//        } else {
//            System.out.println("not prime");
//        }
<<<<<<< HEAD

//fix value
=======
        ////fix value
>>>>>>> 01d74133c0fe65f90aea1423dd64d709af1da6c5
//        int targetValue = 50;
//        int counter = 1;
//
//        while (counter <= targetValue) {
//            if (counter % 3 == 0 && counter % 5 == 0) {
//
//                counter++;
//                continue;
//            }
//            System.out.println(counter);
//            counter++;
//
//        }
//
//        int counterr = 0;
//        while (counterr < targetValue) {
//
//            if (counterr <= targetValue) {
//                counter++;
//                System.out.println(counterr);
//            }
//
//        }
//        counter++;

        int userInput = s.nextInt();
        for (int i = 1; i <= userInput; i++) {
            System.out.println(i + " do it again");
        }

    }

}
