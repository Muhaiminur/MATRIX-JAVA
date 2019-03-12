package matrix.java;
/*PROBLEM 19) Hollow Triangle - Right Justified
Draw right angled triangle of given height
Sample input:
5
Sample output
    5
   45
  3 5
 2  5
12345
*/
import java.util.Scanner;
public class CSE110Lab06task19{
 public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Sample Input");
    int x=abir.nextInt();
    System.out.println("Sample output");
    int c=1;
    int m=x;
    while(c<=(x-1)){
      System.out.println();
      int d=1;
      while(d<=(x-c)){
      System.out.print(" ");
      d++;
      }
      System.out.print(m);
      int e=1;
      while(e<=(c-2)){
       System.out.print(" ");
       e++;
     }
      if(c>1)
      {
      System.out.print(x);
      }
      c++;
      m--;
    }
    System.out.println();
    int e=1;
      while(e<=x)
      {
        System.out.print(e);
        e++;
    }
    System.out.println();
    System.out.println("=======================================================");
  }
}