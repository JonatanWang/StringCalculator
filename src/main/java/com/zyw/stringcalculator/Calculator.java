package com.zyw.stringcalculator;

public class Calculator {

    public long calculate(long number1, long number2, String operator) {
        var result = 0L;
        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    result = Long.MAX_VALUE;
                }
                break;
            default:
                System.out.println("Unknown operator - " + operator);
                break;
        }

        return result;
    }
}
