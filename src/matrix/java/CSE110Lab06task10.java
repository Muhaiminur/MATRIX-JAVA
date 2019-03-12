package matrix.java;
/*PROBLEM 10) Triangle - Isosceles
Draw triangle of given height
Sample input 1:
3
Sample output 1:
  1
 123
12345

Sample input 2:
4
Sample output 2:
   1
  123
 12345
1234567
*/
import java.util.Scanner;
public class CSE110Lab06task10{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter sample input");
    int x=abir.nextInt();
    System.out.println("sample output");
    int c=0;
    while(c<x){
      int d=0;
      while(d<x-(c+1)){
        System.out.print(" ");
        d++;
      }
      int e=c+c+1;
      int f=0;
      while(f<e){
        System.out.print(f+1);
        f++;
      }
      System.out.println();
      c++;
    }
    System.out.println("=======================================================");
  }
}