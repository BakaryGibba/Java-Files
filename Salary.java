
import java.sql.SQLOutput;
import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your Salary: ");
        double salary = input.nextDouble();
        if (salary >= 10000) {
       salary= salary + 2000;
        } else {
            salary = salary + 1000;
        }
        System.out.print("Your salary is $ "+salary);
        }
    }
