import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter Operator(+,-,*,/): ");
        char operator = scanner.next().charAt(0);
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result ;

        switch (operator) {
            case '+':
            result = num1 + num2;
                
                break;
                case '-':
                result = num1-num2;
                break;
                case'*':
                result = num1*num2;
                break;
                case '/':
                if (num1 != 0) {
                    result = num1/num2;
                }else{
                    System.out.println("cannot divide by zero");
                    scanner.close();
                    return;
                }
                break;
        
            default:
            System.out.println("Invalid Operator");
            scanner.close();
                return;


        }

System.out.println("Result: "+ result);




        scanner.close();
    }
}
