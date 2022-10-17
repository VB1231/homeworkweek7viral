import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        System.out.println("Divide by 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i + "");
            }
        }
        System.out.println("Divide by 5:");
        for (int j = 1; j <= 100; j++) {
            if (j % 5 == 0) {
                System.out.println(j + ",");
            }

        }
    }
}
