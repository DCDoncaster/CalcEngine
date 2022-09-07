package com.DCDoncaster.calcengine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double[] leftVals = {100.0d, 25.0d, 5.0d, 124.0d};
        double[] rightVals = {2.0d, 22.0d, 7.0d, 62.0d};
        char[] opCodes = {'a', 's', 'm', 'd'};
        double results[] = new double[opCodes.length];

        if (args.length == 0) {
            for (int i = 0; i < opCodes.length; i++) {
                results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
            }

            for (double currentResult : results)
                System.out.println(currentResult);
        }else if (args.length ==1 && args[0].equals("interactive"))
            executeInteractively();
        else if(args.length ==  3)
            handleCommandLine(args);
        else
            System.out.println("need more arguments");
    }


    static void executeInteractively(){
        System.out.println("Enter an operation and two numbers:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);

    }

    private static void performOperation(String[] parts) {
    char opCode = opCodeFromString(parts[0]);
    double leftVal = valueFromWord(parts[1]);
    double rightVal = valueFromWord(parts[2]);
    double result = execute(opCode,leftVal,rightVal);
    System.out.println(result);
    }



    private static void handleCommandLine(String[] args) {
        char opCode = args[0].charAt(0); //converts string to a char taking first character int he string
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        double result = execute(opCode,leftVal,rightVal);
        System.out.println(result);

    }

    static double execute(char opCode, double leftVal, double rightVal){
        double result;

        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0;
                break;
            default:
                System.out.println("Invalid opCode " + opCode);
                result = 0.0d;
                break;
        }
return result;
    }

    static char opCodeFromString(String operationName){
        return operationName.charAt(0);
    }

        static double valueFromWord(String word){
        String[] numberWords = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };
        double value = 0d;
        for(int index = 0; index <numberWords.length; index++){
            if(word.equals(numberWords[index])){
                value = index;
                break;
            }
        }
        return value;
        }
}