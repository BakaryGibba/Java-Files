import java.util.Scanner;
public class Calculator_Program {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int num1= input.nextInt();
        System.out.print("Please enter the operator(* + - / %): ");
        char operator= input.next().trim().charAt(0);
        System.out.print("Please enter the second number: ");
        int num2= input.nextInt();
        int ans=0;
        if(operator=='*') {
            ans = num1 * num2;
        } else if(operator=='+'){
            ans= num1 + num2;
        } else if (operator=='-') {
            ans= num1 - num2;

        } else if(operator=='/'){
            if(num2!= 0) {
                 ans = num1 / num2;
            }
        } else if (operator=='%') {
            ans= num1 % num2;

        } else{
            System.out.print("Invalid opeartion");
            return;
        }
        System.out.print("Result: "+ans);
    }
}
