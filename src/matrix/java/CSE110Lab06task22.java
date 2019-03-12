package matrix.java;
/*PROBLEM 22) Hollow  Rhombus using solution of PROBLEM 6) Rhombus 
Just draw the image of the above triangle once. And then, the opposite, once.
Sample input:
3
Sample output
  *
 * *
*   *
 * *
  *
*/
import java.util.Scanner;
public class CSE110Lab06task22{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter sample input");
    int x=abir.nextInt();
    System.out.println("sample output");
    int c=1;
    while (c<=x){
      System.out.println ();
      int d = 1;
      while (d<=(x-c)){
        System.out.print (" ");
        d++;
      }
      if (c>1){
        System.out.print ("*");
      }
      int e = 1;
      while (e<=(2*c-3)){
        System.out.print (" ");
        e++;
      }
      System.out.print ("*");
      c++;
    }
    int f = x + 1;
    int j = x - 1;
    while (f<=(2*x-1)){
      System.out.println ();
      int k = 1;
      while (k<=(f-x)){
        System.out.print (" ");
        k++;
      }
      System.out.print ("*");
      int l = 1;
      while (l<=(2*j-3)){
        System.out.print (" ");
        l++;
      }
      if (f<(2*x-1)){
        System.out.print ("*");
      }
      f++;
      j--;
    }
    System.out.println ();
    System.out.println("=======================================================");
  }
}