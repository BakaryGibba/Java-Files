import sun.awt.geom.AreaOp;

import java.awt.dnd.peer.DragSourceContextPeer;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int num1= input.nextInt();
        System.out.println("Please enter the second number: ");
        int num2= input.nextInt();
        int sum= num1 + num2;
        System.out.print("Your Sum is "+sum);
    }
}
