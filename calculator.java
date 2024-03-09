import java.util.Scanner;

public class Calculator {
    
    // Function to add two numbers
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    
    // Function to subtract two numbers
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    
    // Function to multiply two numbers
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    
    // Function to divide two numbers
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return num1 / num2;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operator;
        
        System.out.println("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        num2 = scanner.nextDouble();
        System.out.println("Enter operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);
        
        double result = 0;
        
        switch(operator) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                try {
                    result = divide(num1, num2);
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }
        
        System.out.println("Result: " + result);
    }
}