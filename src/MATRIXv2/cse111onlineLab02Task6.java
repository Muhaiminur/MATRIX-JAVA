package MATRIXv2;
/*Task 6:
Write a java program that, given an M x N matrix, swap the rows i and j, where i and j are provided by the user
Assuming that there is matrix (i.e. you create one with hard coded values or better still take one from the user as input) 
you ask the user to enter the row numbers to be swapped � ;-) you should be able to figure out the rest :P
double [][] a={{41.0,2.0,3.0},{3.0,1.0,2.5},{1.5,6.5,7.25}};
*/
import java.util.Scanner;
public class cse111onlineLab02Task6{
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
    System.out.println("Enter your swap the rows ");
    int z=abir.nextInt();
    System.out.println("Enter your Matrix final rows");
    int m=abir.nextInt();
    int[]b=new int[a[z].length];
    int d=0;
    while(d<a[z].length){
      b[d]=a[z][d];
      d++;
    }
    int e=0;
    while(e<a[m].length){
      a[z][e]=a[m][e];
      e++;
    }
    int f=0;
    while(f<a[m].length){
      a[m][f]=b[f];
      f++;
    }
    int g=0;
    while(g<a.length){
      int h=0;
      System.out.print("[");
      while(h<a[g].length){
        System.out.print(a[g][h]+" ");
        h++;
      }
      System.out.print("]");
      g++;
      System.out.println();
    }
  }
}