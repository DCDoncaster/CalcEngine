package com.DCDoncaster.calcengine;

public class Main {

    public static void main(String[] args) {

        double[] leftVals = {100.0d, 25.0d, 5.0d, 124.0d};
        double[] rightVals = {2.0d, 22.0d, 7.0d, 62.0d};
        char[] opCodes = {'+', '-', '*', '/'};
        double results[] = new double[opCodes.length];

        for (int i = 0; i < opCodes.length; i++) {
            switch (opCodes[i]) {
                case '+':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case '-':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case '*':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                case '/':
                    results[i] = rightVals[i] != 0 ? leftVals[i] / rightVals[i] : 0;
                    break;
                default:
                    System.out.println("Invalid opCode" + opCodes[i]);
                    results[i] = 0.0d;
                    break;
            }


        }

        for(double currentResult:results)
            System.out.println(currentResult);
    }
}