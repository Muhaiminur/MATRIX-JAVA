package matrix.java;
/*PROBLEM 3) Rectangle 
Sample input:
4
6
Sample output
123456
123456
123456
123456
Hint: 4 and 6 means 4 lines of numbers having 1..6 in each line.
*/
import java.util.Scanner;
public class CSE110Lab06task4{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter sample input");
    int x=abir.nextInt();
    System.out.println("Enter sample input");
    int y=abir.nextInt();
    System.out.println("sample output");
    int c=0;
    while(c<x){
      int d=0;
      while(d<y){
        System.out.print(d+1);
        d++;
      }
      System.out.println();
      c++;
    }
    System.out.println("=======================================================");
  }
}