package com.olhakurbatova.practice1;

import java.util.Scanner;

public class Activator {


    public static void main(String[] args) {
        String operation;


        boolean needContinue = true;

        while (needContinue) {
            System.out.println("Choose needed option: +,-,*,/, exit");

            Scanner in = new Scanner(System.in);
            operation = in.nextLine();
            if (operation.equals("exit") || operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
                if (operation.equals("exit")) {
                    needContinue = false;
                    System.out.println("Good bye!");
                } else {
                    System.out.print("a=");
                   // double a = in.nextDouble();
                    double a= Double.parseDouble(in.nextLine());
                    System.out.print("b=");
                    double b= Double.parseDouble(in.nextLine());
                    //double b = in.nextDouble();
                    CalcFunctions calc = new CalcFunctions();
                    if (operation.equals("+")) {
                        double result = calc.plus(a, b);
                        System.out.println("a+b=" + result);
                    }
                    if (operation.equals("-")) {
                        double result = calc.minus(a, b);
                        System.out.println("a-b=" + result);
                    }
                    if (operation.equals("/")) {
                        double result = calc.devide(a, b);
                        System.out.println("a+b=" + result);
                    }
                    if (operation.equals("*")) {
                        double result = calc.mult(a, b);
                        System.out.println("a*b=" + result);
                    }
                }
            } else System.out.println("Incorrect symbol, please, try again");
        }
    }

}
