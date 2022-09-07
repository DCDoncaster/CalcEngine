package com.DCDoncaster.calcengine;

public class Main {

    public static void main(String[] args) {

        double[] leftVals = {100.0d, 25.0d, 5.0d, 124.0d};
        double[] rightVals = {2.0d, 22.0d, 7.0d, 62.0d};
        char[] opCodes = {'+', '-', '*', '/'};
        double results[] = new double[opCodes.length];

        for (int i = 0; i < opCodes.length; i++) {
        results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);

        }

        for(double currentResult:results)
            System.out.println(currentResult);
    }
    static double execute(char opCode, double leftVal, double rightVal){
        double result;

        switch (opCode) {
            case '+':
                result = leftVal + rightVal;
                break;
            case '-':
                result = leftVal - rightVal;
                break;
            case '*':
                result = leftVal * rightVal;
                break;
            case '/':
                result = rightVal != 0 ? leftVal / rightVal : 0;
                break;
            default:
                System.out.println("Invalid opCode" + opCode);
                result = 0.0d;
                break;
        }
return result;
    }
}