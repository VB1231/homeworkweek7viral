import java.util.Scanner;

public class EvenOddUsingTernaryOp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int a = scanner.nextInt();
        scanner.close();
    String result = a%2==0 ? "Even" : "Odd";
        System.out.println(a+" is "+result);
    }
}
