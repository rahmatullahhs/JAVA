/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bigintegerfactorial;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BigIntegerFactorial {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Number");

        int userInput = s.nextInt();
//        BigInteger factorial= new BigInteger("10");
//      BigInteger factorial= BigInteger.valueOf("10");
        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= userInput; i++) {

            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);

        
    }

}
