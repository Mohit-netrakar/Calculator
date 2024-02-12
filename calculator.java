/**
 * The calculator class provides methods for performing basic arithmetic operations such as addition,
 * subtraction, multiplication, and division.
 */
public class calculator 
{

    public static float add(float num1, float num2) {
        return num1 + num2;
    }

    public static float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public static float multiply(float num1, float num2) {
        return num1 * num2;
    }

    public static float divide(float num1, float num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero!");
            return Float.NaN; 
        }
    }

    public static void main(String[] args) {

        float operand1 = 10.5f;
        float operand2 = 5.2f;

        System.out.println("Addition: " + add(operand1, operand2));
        System.out.println("Subtraction: " + subtract(operand1, operand2));
        System.out.println("Multiplication: " + multiply(operand1, operand2));
        
        System.out.println("Division: " + divide(operand1, operand2));
        System.out.println("Division by zero: " + divide(operand1, 0));
    }
}
