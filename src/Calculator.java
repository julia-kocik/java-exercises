import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź operacje +, -, /, * , %, ^ , √");

        // sprawdź czy operator jest valid
        String[] operators = new String[]{"+", "-", "/", "*" , "%", "^" , "√"};
        String operation = scanner.next();
        boolean isOperationCorrect = false;
        for (String i: operators) {
            if (i.equals(operation)) {
                isOperationCorrect = true;
                break;
            }
        }
        if(!isOperationCorrect) {
            System.out.println("Wrong operator");
            scanner.close();
            return;
        }

        //Wprowadzenie operandów
        System.out.println("Wprowadź 1 operand");
        int input1 = scanner.nextInt();
        int input2 = 0;
        // jeśli pierwiastek wprowadzamy tylko jeden
        if(!operation.equals("√")) {
            System.out.println("Wprowadź 2 operand");
            input2 = scanner.nextInt();
        }

        int result = switch(operation) {
            case "+" -> input1 + input2;
            case "-" -> input1 - input2;
            case "/" -> input1 / input2;
            case "*" -> input1 * input2;
            case "%" -> input1 % input2;
            case "^" -> (int) Math.pow(input1, input2);
            case "√" -> (int) Math.sqrt(input1);
            default -> 0;
        };

        System.out.println(result);
        scanner.close();
    }
}