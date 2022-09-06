package com.DCDoncaster.calcengine;

public class Main {

    public static void main(String[] args) {
        double value1 = 100.0d;
        double value2 = 10.0d;
        double result = 0.0;
        char opCode = '/';

        switch (opCode) {
            case '+':
                result = value1 + value2;
                break;
            case '-':
                result = value1 - value2;
                break;
            case '*':
                result = value1 * value2;
                break;
            case '/':
                result = value2 != 0 ? value1 / value2: 0;
                break;
            default:
                System.out.println("Invalid opCode" + opCode);
                result = 0.0d;
                break;
        }
        System.out.println(result);

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