import java.util.Scanner;

public class CityAlphabetSwitch {
    public static void main(String[] args) {
        String s[] = {"Ahmedabad", "Bombay", "Chennai", "Kolkata", "London"};
        Scanner t = new Scanner(System.in);
        String n;
        System.out.println("Enter Alphabet to show city name :");
        n = t.nextLine();

            switch (n) {

                case "a":
                    System.out.println("City name is :" + s[0]);
                    break;
                case "b":
                    System.out.println("City name is :" + s[1]);
                    break;
                case "c":
                    System.out.println("City name is :" + s[2]);
                    break;
                case "k":
                    System.out.println("City name is :" + s[3]);
                    break;
                case "l":
                    System.out.println("City name is :" + s[4]);
                    break;
                default:
                    System.out.println("Invalid city name:");
                    break;
            }

        t.close();

    }
}
