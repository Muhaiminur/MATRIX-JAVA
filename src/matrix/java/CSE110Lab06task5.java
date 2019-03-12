package matrix.java;
/*PROBLEM 5) Triangle - Left Justified
Draw right angled triangle of given height
Sample input:
4
Sample output
*
**
***
****

Hint: One loop for lines, another loop for printing i number of starts when it is line i.
*/
import java.util.Scanner;
public class CSE110Lab06task5{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter sample input");
    int x=abir.nextInt();
    System.out.println("sample output");
    int c=0;
    while(c<x){
      int d=0;
      while(d<=c){
        System.out.print("*");
        d++;
      }
      System.out.println();
      c++;
    }
    System.out.println("=======================================================");
  }
}