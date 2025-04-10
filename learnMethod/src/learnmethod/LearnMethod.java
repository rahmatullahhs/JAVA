package learnmethod;

import java.util.Scanner;

public class LearnMethod {

    public static void main(String[] args) {

//        System.out.println(doSum(10, 50));
        Scanner s = new Scanner(System.in);

//        int taka=s.nextInt();
//        float faka=s.nextFloat();
//        float result=doSum(taka, faka);
//        System.out.println(result + " money");
        int input = s.nextInt();
        System.out.println(doPrime(input));
//String result=doPrime(input);

//        System.out.println(FindOddEven(input));
    }

    public static float doSum(int num1, float num2) {
        float result = (num1 + num2);
        return result;
    }

    public static String doPrime(int input) {
        String result = " ";
        int count = 0;
        for (int i = 1; i <= input; i++) {

            if (input % i == 0) {
                count += 1;
            }
        }
        if (count == 2) {

            result = (input + "is prime number");
        } else {
            result = (input + "is not a prime number");
        }
        return result;
    }

    
    public static String findOddEven(int input) {
        String result = " ";
        if (input % 2 == 0) {
            result = ("odd");
        } else {
            result = ("even");

        }
        return result;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
