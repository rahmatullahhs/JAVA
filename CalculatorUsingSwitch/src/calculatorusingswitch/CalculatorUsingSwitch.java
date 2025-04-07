package calculatorusingswitch;

import java.util.Scanner;

public class CalculatorUsingSwitch {

    public static void main(String[] args) {
                       
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st num");
        double num1 = s.nextDouble();
        System.out.println("Enter 2nd num");
        double num2 = s.nextDouble();
        System.out.println("input any action like as + - * / ");
        String act = s.next();

        double answer = 0;

        switch (act) {
            case "+":
                answer = num1 + num2;
                break;

            case "-":
                answer = num1 - num2;
                break;

            case "*":
                answer = num1 / num2;
                break;

            case "/":
                answer = num1 * num2;
                break;
            default:
                System.out.println("follow what i say");
        }
        System.out.println(answer);

    }

}
