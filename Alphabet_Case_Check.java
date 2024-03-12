import java.util.Scanner;
public class Alphabet_Case_Check{
    public static void main(String[] args){
      Scanner input= new Scanner(System.in);
      System.out.print("Please enter the alphabet: ");
      char ch= input.next().charAt(0);
      if ((ch >= 'a') && (ch <= 'z')){
          System.out.print("Lowercase");
      } else{
          System.out.print("Uppercase");
      }
    }
}