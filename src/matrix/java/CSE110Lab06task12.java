package matrix.java;
/*PROBLEM 12) Rhombus using PROBLEM 5) Triangle - Isosceles
Just draw the image of the above triangle once.  And then, the opposite, once.
Sample input:
3
Sample output
  *
 ***
*****
 ***
  *
*/
import java.util.Scanner;
public class CSE110Lab06task12{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Sample Input");
    int x=abir.nextInt();
    System.out.println("Sample output");
    int c=0;
    while(c<x){
      int d=x-1;
      while(d>c){
       System.out.print(" ");
       d--;
      }
      int e=0;
      while(e<=c+c){
        System.out.print("*");
        e++;
      }
      System.out.println();
      c++;
    }
    int f=x-2;
    while(f>=0){
      int k=f;
      while(k<x-1){
        System.out.print(" ");
        k++;
      }
      int l=0;
      while(l<=f+f){
        System.out.print("*");
        l++;
      }
      f--;
      System.out.println();
    }
    System.out.println("=======================================================");
  }
}