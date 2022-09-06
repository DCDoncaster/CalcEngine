package com.DCDoncaster.calcengine;

public class Main {

    public static void main(String[] args) {

        double[] leftVals = {100.0d, 25.0d, 5.0d, 124.0d};
        double[] rightVals = {2.0d, 22.0d, 7.0d, 62.0d};
        char[] opCodes = {'+', '-', '*', '/'};
        double results[] = new double[opCodes.length];


//        double value1 = 100.0d;
//        double value2 = 10.0d;
//        double result = 0.0;
//        char opCode = '/';
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
//            System.out.println(results);
        for(double currentResult:results)
            System.out.println(currentResult);

        }
    }
}



//        if (opCode == '+')
//            result = value1 + value2;
//        else if (opCode == '-')
//            result = value1 - value2;
//        else if (opCode == '*')
//            result = value1 * value2;
//        else if (opCode == '/') {
//            if (value2 != 0)
//                result = value1 / value2;
//        }
//            else {
//                System.out.println("Invalid opCode: " + opCode);
//                result = 0.0d;
//            }
//        System.out.println(result);
//    }
//    }