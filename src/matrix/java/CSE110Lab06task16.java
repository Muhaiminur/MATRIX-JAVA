package matrix.java;
/*PROBLEM 16) Hollow Triangle - Left Justified using solution of PROBLEM 3) Triangle - Left Justified
Draw right angled triangle of given height
Sample input:
5
Sample output
*
**
* *
*  *
*****
*/
import java.util.Scanner;
public class CSE110Lab06task16{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter sample input");
    int x=abir.nextInt();
    System.out.println("sample output");
    System.out.println("*");
    int c=0;
    while(c<x-2){
      System.out.print("*");
      int y=c;
      int d=0;
      while(d<y){
       System.out.print(" ");
       d++;
      }
      c++;
      System.out.print("*");
      System.out.println();
    }
    int e=0;
    while(e<x){
      System.out.print("*");
      e++;
    }
    System.out.println();
    System.out.println("=======================================================");
  }
}