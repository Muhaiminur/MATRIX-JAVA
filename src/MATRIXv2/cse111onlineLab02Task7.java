package MATRIXv2;
/*Task 7: 
Write a java program that, given an M x N matrix, creates the transpose of the matrix. 

*/
import java.util.Scanner;
public class cse111onlineLab02Task7{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter your Matrix collum");
    int x=abir.nextInt();
    System.out.println("Enter your Matrix rows");
    int y=abir.nextInt();
    int[][]a=new int[x][y];
    int[][]temp=new int[a[2].length][a.length];
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
      while(f<a[e].length){
        temp[f][e]=a[e][f];
        f++;
      }
      e++;
    }
    int g=0;
    while(g<a[0].length){
      int h=0;
      System.out.print("[");
      while(h<a.length){
        System.out.print(temp[g][h]+" ");
        h++;
      }
      System.out.print("]");
      g++;
      System.out.println();
    }
  }
}