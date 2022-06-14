package com.hcl;

public class Calculator {

    public double add(double numberOne, double numberTwo) {
        // TODO Auto-generated method stub

        System.out.println("The sum of " + numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo));
        return numberOne + numberTwo;
    }


    public double subtract(double numberOne, double numberTwo) {
        System.out.println("The diffrence of " + numberOne + " - " + numberTwo + " = " + (numberOne - numberTwo));
        return numberOne - numberTwo;
    }

    public double multiply(double numberOne, double numberTwo) {
        System.out.println("The product of " + numberOne + " * " + numberTwo + " = " + (numberOne * numberTwo));
        return numberOne * numberTwo;
    }

    public double divide(double numberOne, double numberTwo) {
        if (numberTwo == 0) {
            System.out.println("You will get an error");
        }

        System.out.println("The division of " + numberOne + " / " + numberTwo + " = " + (numberOne / numberTwo));
        return numberOne / numberTwo;
    }

    public double mod(double numberOne, double numberTwo) {
        System.out.println("The remainder of " + numberOne + " % " + numberTwo + " = " + (numberOne % numberTwo));
        return numberOne % numberTwo;
    }

    public double square(double numberOne, double numberTwo) {
        System.out.println("The square of " + numberOne + " ^ " + numberTwo + " = " + (Math.pow(numberOne, numberTwo)));
        return Math.pow(numberOne, numberTwo);
    }

    public double squareRoot(double numberOne) {
        if (numberOne < 0) {
            System.out.println("You cannot take a negative of square root numbers");
        }

        System.out.println("The square root of " + numberOne + " = " + (Math.sqrt(numberOne)));
        return Math.sqrt(numberOne);
    }


}
