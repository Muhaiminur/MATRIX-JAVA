package matrix.java;
/*8PROBLEM 2) Star Line
Print as many stars as given in input
Sample input:
6
Sample output
******
*/
import java.util.Scanner;
public class CSE110Lab06task2{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter sample input");
    int x=abir.nextInt();
    System.out.println("sample output");
    int c=0;
    while(c<x){
      System.out.print("*");
      c++;
    }
    System.out.println();
    System.out.println("=======================================================");
  }
}