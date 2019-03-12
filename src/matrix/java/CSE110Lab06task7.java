package matrix.java;
/*PROBLEM 4) Triangle - Right Justified
Draw right angled triangle of given height
Sample input:
4
Sample output
   *
  **
 ***
****
Hint: Count and print appropriate number of spaces in front of stars. Notice that there is one less space and one more star in each line.
*/
import java.util.Scanner;
public class CSE110Lab06task7{
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
      int e=0;
      while(e<=c){
        System.out.print("*");
        e++;
      }
      System.out.println();
      c++;
    }
    System.out.println("=======================================================");
  }
}