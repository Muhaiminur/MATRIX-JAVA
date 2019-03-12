package matrix.java;
/*PROBLEM 14) Hollow Rectangle using solution of PROBLEM 2) Rectangle 
Display a rectangle of given length and width. 
Sample input:
4
5
Sample output
*****
*   *
*   *
*****

Hint 1: Print the character space (�   �)  in the middle.
Hint 2: You can re-use your solution to PROBLEM 2 and use if condition to selectively print first and last star of each line and all stars of first and last line.
*/
import java.util.Scanner;
public class CSE110Lab06task14{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter sample input");
    int x=abir.nextInt();
    int y=abir.nextInt();
    System.out.println("sample output");
    int d=0;
    while(d<y){
      System.out.print("*");
      d++;
    }
    System.out.println();
    int e=0;
    while(e<x-2){
      System.out.print("*");
      int f=0;
      while(f<y-2){
        System.out.print(" ");
        f++;
        }
      System.out.print("*");
      System.out.println();
      e++;
      }
      int g=0;
      while(g<y){
        System.out.print("*");
        g++;
      }
      System.out.println();
      System.out.println("=======================================================");
  }
}