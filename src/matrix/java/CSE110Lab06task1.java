package matrix.java;
/*PROBLEM 1) Number Line
Sample input:
6
Sample output
123456
*/
import java.util.Scanner;
public class CSE110Lab06task1{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter sample input");
    int x=abir.nextInt();
    System.out.println("sample output");
    int c=0;
    while(c<x){
      System.out.print(c+1);
      c++;
    }
    System.out.println();
    System.out.println("=======================================================");
  }
}