package matrix.java;
/*PROBLEM 25) Palindromic  Triangle
Sample input:
5
Sample output
    1
   121
  12321
 1234321
123454321
*/
import java.util.Scanner;
public class CSE110Lab06task25{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter sample input");
    int x=abir.nextInt();
    System.out.println("sample output");
    int c = 1;
    while(c<=x){
      System.out.println ();
      int d = 1;
      while (d<=(x-c)){
        System.out.print (" ");
        d++;
      }
      d = 1;
      while (d<=c){
        System.out.print (d);
        d++;
      }
      d = c-1;
      while(d>=1){
        System.out.print (d);
        d--;
      }
      c++;
    }
    System.out.println();
    System.out.println("=======================================================");
  }
}