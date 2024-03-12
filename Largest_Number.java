import java.sql.SQLOutput;
import java.util.Scanner;
public class Largest_Number {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int num1= input.nextInt();
        System.out.print("Please enter the second number: ");
        int num2= input.nextInt();
        System.out.print("Please enter the third number: ");
        int num3= input.nextInt();

        if ((num1 >= num2) && (num1 >= num3)) {
            System.out.println("The largest number is "+num1);
        } else if ((num2 >= num1) && (num2 >= num3)) {
            System.out.print("The largest number is "+num2);
        } else {
            System.out.print("The largest number is "+ num3);
        }
    }
}
