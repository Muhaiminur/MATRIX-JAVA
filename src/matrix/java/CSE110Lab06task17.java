package matrix.java;
/*PROBLEM 17) Hollow Triangle - Left Justified
Draw right angled triangle of given height
Sample input:
5
Sample output
1
12
1 3
1  4
12345
*/
import java.util.Scanner;
public class CSE110Lab06task17{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter sample input");
    int x=abir.nextInt();
    System.out.println("sample output");
    System.out.println(1);
    int c=2;
    while(c<=x-1){
      System.out.print(1);
      int d=1;
      while(d<=c-2){
       System.out.print(" ");
       d++;
      }
      System.out.print(c);
      c++;
      System.out.println();
    }
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