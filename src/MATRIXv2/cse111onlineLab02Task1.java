package MATRIXv2;
/*Task 1: 
Write a java program that creates an M by N matrix, where M and N are values given by the user. The user will provide values for the matrix.
Print the values in the matrix (each of the M rows should be on separate lines) to the standard output.
*/
import java.util.Scanner;
public class cse111onlineLab02Task1{
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
      while(d<a[c].length){
        a[c][d]=abir.nextInt();
        d++;
      }
      c++;
    }
    int e=0;
    while(e<a.length){
      int f=0;
      System.out.print("[");
      while(f<a[e].length){
        System.out.print(a[e][f]+" ");
        f++;
      }
      System.out.print("]");
      e++;
      System.out.println();
    }
  }
}