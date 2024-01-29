package InitTools;

import OperationTools.OperationInterface;

public class Starter {
    public static void startApp(){
        OperationInterface sum = (a,b) -> a + b;
        OperationInterface subtraction = (a,b) -> a - b;
        OperationInterface multiplication = (a,b) -> a * b;
        OperationInterface division = (a,b) -> a / b;

        int num1 = 5;
        int num2 = 10;

        System.out.println(sum.operation(num1,num2));
        System.out.println(subtraction.operation(num1,num2));
        System.out.println(multiplication.operation(num1,num2));
        System.out.println(division.operation(num1,num2));
    }
}
