package MATRIXv2;
/*Task 9:    
Write a java program that, given two M x N matrices, subtracts the second one from the first. 
*/
import java.util.Scanner;
public class cse111onlineLab02Task9{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Enter your Matrix collum");
    int x=abir.nextInt();
    System.out.println("Enter your Matrix rows");
    int y=abir.nextInt();
    int[][]a=new int[x][y];
    int[][]sub
      =new int[x][y];
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
        sub[g][h]=a[g][h]-b[g][h];
        System.out.print(sub[g][h]+" ");
        h++;
      }
      System.out.print("]");
      g++;
      System.out.println();
    }
  }
}