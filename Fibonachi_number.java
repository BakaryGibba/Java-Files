import java.util.Scanner;
public class Fibonachi_number {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter the Fibonacci number: ");
        int n= input.nextInt();
        int a= 0;
        int b= 1;
        int count= 2;
        while(count <= n){
            int temp= b;
            b= b + a;
            a= temp;
            count++;
        }
        //System.out.print("The fibonacci number is "+b+" ");
        System.out.print("The fibonacci number is "+b);
    }
}
