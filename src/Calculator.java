import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a=s.nextInt();
        System.out.println("Enter value of b:");
        int b=s.nextInt();
        System.out.println("Enter operation you want to do :");
        String c=s.next();
        switch(c) {

            case "+":
                int Add = a + b;
                System.out.println("Addition of two number is "+Add);
                break;
            case "-":
            int Sub = a - b;
                System.out.println("Substraction of two number is :"+Sub);
                break;
            case "*":
              int Mul = a * b;
                System.out.println("Multiplication of two number is :"+Mul);
                break;
            case "/":
                int Div = a / b;
                System.out.println("Division of two number is :"+Div);
                break;
        }
        s.close();

    }
}
