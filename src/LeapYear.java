import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year :");
        int year = scan.nextInt();
      int result =year%4;
      if (result==0){
          System.out.println(year+" is Leap Year");
                }
      else{
          System.out.println(year+"is not Leap Year");
      }
      scan.close();
    }
}
