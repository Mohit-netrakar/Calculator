public class Calculator {
    float num1;
    float num2;
    float n;
    Calculator(float num1, float num2, float n) {
        this.num1 = num1;
        this.num2 = num2;
        this.n = n;
    }
    float add() {
        return num1+num2;
    }
    float subtract() {
        return num1-num2;
    }
    float multiply() {
        return num1*num2;
    }
    float divide() {
        if (num2!= 0) {
            return num1/num2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return num1;
        }
    }
    float square() {
        return n*n;
    }
    float cube() {
        return n*n*n;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10, 5,6);
        System.out.println("Addition: " + calculator.add());
        System.out.println("Subtraction: " + calculator.subtract());
        System.out.println("Multiplication: " + calculator.multiply());
        System.out.println("Division: " + calculator.divide());
        System.out.println("Square of number is:"+calculator.square());
        System.out.println("Cube of number is:"+calculator.cube());
    }
}