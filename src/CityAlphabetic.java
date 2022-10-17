import java.util.Scanner;

public class CityAlphabetic {
    public static void main(String[] args) {
        String s[] = {"Ahmedabad", "Bombay", "Chennai", "Kolkata", "London"};
        String s1;
        Scanner t = new Scanner(System.in);
        System.out.println("Enter Alphabet to show city name :");
        s1 = t.next();
        if (s1.equals("a") ||s1.equals("b") || s1.equals("c") || s1.equals("k")  || s1.equals("l") ) {
            if (s1.equals("a")) {
                System.out.println("City is :" + s[0]);
            } else if (s1.equals("b")) {
                System.out.println("City is :" + s[1]);
            } else if (s1.equals("c")){
                System.out.println("City is :" + s[2]);
            } else if (s1.equals("k")) {
                System.out.println("City is :"+s[3]);
            }else
            {System.out.println("City is :"+s[4]);
            }
        } else {
            System.out.println("Invalid Alphabet :");
        }
        t.close();
    }
}
