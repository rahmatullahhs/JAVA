
package bigintegerfactorial;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerFactorial {

    public static void main(String[] args) {
//take a variable of scaner
        Scanner s = new Scanner(System.in);
//print what to do a user
        System.out.println("Enter Number");
//a storage for data which user inputed
        int userInput = s.nextInt();
//        make a variable "fctorial" in BigInteger datatype

//        BigInteger factorial= new BigInteger("10");
//      BigInteger factorial= BigInteger.valueOf("10");
        BigInteger factorial = BigInteger.ONE;
//for loop for math
        for (int i = 1; i <= userInput; i++) {
//variable assined as result carrier
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
//        print result
        System.out.println(factorial);

        
    }

}
