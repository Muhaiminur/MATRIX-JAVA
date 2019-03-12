package MATRIXv2;
/*Task 8:
Write a java program that, given two M x N matrices, adds them.
Note that for this and all questions before this, it is up to you to check the validity of your input, i.e. before
actually adding the two matrices, you need to check their dimensions to see if the can actually be added. 
*/
import java.util.Scanner;
public class cse111onlineLab02Task8{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter your Matrix collum");
    int x=abir.nextInt();
    System.out.println("Enter your Matrix rows");
    int y=abir.nextInt();
    int[][]a=new int[x][y];
    int[][]sum=new int[x][y];
    int c=0;
    while(c<a.length){
      int d=0;
      while(d<a[c].length){
        a[c][d]=abir.nextInt();
        d++;
      }
      c++;
    }
    System.out.println("Enter your 2nd Matrix collum");
    int z=abir.nextInt();
    System.out.println("Enter your 2nd Matrix rows");
    int m=abir.nextInt();
    int[][]b=new int[z][m];
    int e=0;
    while(e<a.length){
      int f=0;
      while(f<a[e].length){
        b[e][f]=abir.nextInt();
        f++;
      }
      e++;
    }
    int g=0;
    while(g<a.length){
      int h=0;
      System.out.print("[");
      while(h<a[0].length){
        sum[g][h]=a[g][h]+b[g][h];
        System.out.print(sum[g][h]+" ");
        h++;
      }
      System.out.print("]");
      g++;
      System.out.println();
    }
  }
}