import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int a = s.nextInt();
        if(a%2==0)
        {
            System.out.println(a+" is even");
        }else{
            System.out.println(a+" is odd");
        }
        s.close();
    }
}
