import java.util.Scanner;

public class markSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name :");
        String StudentName = scanner.nextLine();
       // System.out.println(StudentName);
        System.out.println("Enter Student RollNumber :");
        int rollNo = scanner.nextInt();
       // System.out.println(rollNo);
        System.out.println("Enter Maths Marks :");
        int MarksM = scanner.nextInt();
       // System.out.println(MarksM);
        System.out.println("Enter Science Marks :");
        int MarksS = scanner.nextInt();
       // System.out.println(MarksS);
        System.out.println("Enter English Marks :");
        int MarksE = scanner.nextInt();
     //   System.out.println(MarksE);
        scanner.close();
        String result;
        int total = MarksM + MarksS + MarksE;
        System.out.println("total marks" + total);
        int percentage = total / 3;
        System.out.println("total percentage :" + percentage);
        String grade;
        if (MarksM < 100 && MarksM > 0 && MarksS < 100 && MarksS > 0 && MarksE < 100 && MarksE > 0) {
            if (percentage >= 80) {
                result = "Pass";
                grade = "A+";
            } else if (percentage >= 60) {
                result = "Pass";
                grade = "A";
            } else if (percentage >= 50) {
                result = "Pass";
                grade = "B";
            } else if (percentage >= 35) {
                result = "Pass";
                grade = "A+";
            } else {
                result = "Fail";
                grade = "D";
            }
            System.out.println("_______________________________\n" +

                    "|       Mark Sheet              |\n" +
                    "|_______________________________|");
            System.out.println("|_______________________________|\n" +
                    "| Name : " + StudentName + "                   |\n" +
                    "| Roll No: " + rollNo + "                      |\n" +
                    "|_______________________________|");
            System.out.println("| Subjects : Marks              |\n" +
                    "|_______________________________|");
            System.out.println("|_______________________________|\n" +
                    "| Math    : " + MarksM + "                 |\n" +
                    "| Science : " + MarksS + "                 |\n" +
                    "| English : " + MarksE + "                 |");
            System.out.println("| Total : " + total+"                  |\n" +
                    "|_______________________________|");
            System.out.println("| Percentage : " + percentage +"             |\n" +
                    "| Result : " + result + "                 |\n" +
                    "| Grade : " + grade + "                    |\n" +
                    "|_______________________________|");

        }
    }
}


