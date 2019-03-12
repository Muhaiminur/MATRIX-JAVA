package matrix.java;
/*PROBLEM 15) Hollow Rectangle
Display a rectangle of given length and width. 
Sample input:
4
5
Sample output
12345
1   5
1   5
12345
*/
import java.util.Scanner;
public class CSE110Lab06task15{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter sample input");
    int x=abir.nextInt();
    int y=abir.nextInt();
    System.out.println("sample output");
    int d=0;
    while(d<y){
      System.out.print(d+1);
      d++;
    }
    System.out.println();
    int e=2;
    while(e<=x-1){
      System.out.print(1);
      int f=1;
      while(f<=y-2){
        System.out.print(" ");
        f++;
        }
      System.out.print(y);
      System.out.println();
      e++;
      }
      int g=0;
      while(g<y){
        System.out.print(g+1);
        g++;
      }
      System.out.println();
      System.out.println("=======================================================");
  }
}