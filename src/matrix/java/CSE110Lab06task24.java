package matrix.java;
/*PROBLEM 24) Palindrome
Sample input:
5
Sample output
123454321
*/
import java.util.Scanner;
public class CSE110Lab06task24{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter sample input");
    int x=abir.nextInt();
    System.out.println("sample output");
    int c=0;
    while(c<x){
      System.out.print(c+1);
      c++;
    }
    int d= x-1;
    while (d>=1){
      System.out.print (d);
      d--;
    }
    System.out.println();
    System.out.println("=======================================================");
  }
}