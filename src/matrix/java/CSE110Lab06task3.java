package matrix.java;
/*PROBLEM 3) Rectangle using solution of PROBLEM 1) Star Line
Sample input:
4
6
Sample output
******
******
******
******

Hint: 4 and 6 means 4 lines of stars having 6 stars in each line.
*/
import java.util.Scanner;
public class CSE110Lab06task3{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter sample input");
    int x=abir.nextInt();
    System.out.println("Enter sample input");
    int y=abir.nextInt();
    System.out.println("sample output");
    int c=0;
    while(c<x){
      int d=0;
      while(d<y){
        System.out.print("*");
        d++;
      }
      System.out.println();
      c++;
    }
    System.out.println("=======================================================");
  }
}