package MATRIXv2;
/*Task 2: 
Write a java program that creates an M by N matrix of 0�s, where M and N are provided by the user. 
*/
import java.util.Scanner;
public class cse111onlineLab02Task2{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter your Matrix collum");
    int x=abir.nextInt();
    System.out.println("Enter your Matrix rows");
    int y=abir.nextInt();
    int[][]a=new int[x][y];
    int c=0;
    while(c<a.length){
      int d=0;
      System.out.print("[");
      while(d<a[c].length){
        System.out.print(a[c][d]+" ");
        d++;
      }
      System.out.print("]");
      c++;
      System.out.println();
    }
  }
}