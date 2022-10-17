import java.util.Scanner;

/*HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF*/
public class SalarySlip {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter empID :");
        int empID = s.nextInt();
        System.out.print("Enter Employee Name:");
        String empName = s.next();
        System.out.println("Enter Employee Salary :");
        int salary = s.nextInt();
        int HRA = salary * 10 / 100;
        int DA = salary * 9 / 100;
        int TA = salary * 8 / 100;
        int PF = salary * 20 / 100;
        int Gr = salary + HRA + TA + DA - PF;
        System.out.println("_______________________________");
        System.out.println("|         Salary Slip          |");
        System.out.println("|______________________________|");
        System.out.println("| Employee Id :   " + empID + "        |");
        System.out.println("| Employee Name : " + empName + "      |");
        System.out.println("|______________________________|");
        System.out.println("| Basic Salary : " + salary + "        |");
        System.out.println("| HRA 10% :      " + HRA + "           |");
        System.out.println("| TA 8% :        " + TA + "            |");
        System.out.println("| DA 9% :        " + DA + "            |");
        System.out.println("| PF 20%:        " + PF + "            |");
        System.out.println("|______________________________|");
        System.out.println("| Gross Salary :  " + Gr + "           |");
        System.out.println("|===========================|");
        s.close();
    }
}
