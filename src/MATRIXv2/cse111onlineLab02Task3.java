package MATRIXv2;
/*Task 3: 
Write a java program that creates an M by N matrix from a 2D array provided by the user. 
Assume the following exists in your main method: 
double array[][]={{1.0,2.0,3.0},{3.0,1.0,2.5},{1.5,6.5,7.25},{5.5,6.5,7.5}};
There is a 2D array provided, or you take one as input from the user, and then copy the data from that to a matrix ( which is off course just another 2D array :P ) 
*/
import java.util.Scanner;
public class cse111onlineLab02Task3{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    double array[][]={{1.0,2.0,3.0},{3.0,1.0,2.5},{1.5,6.5,7.25},{5.5,6.5,7.5}};
    double[][]a=new double[array.length][array[1].length];
    int c=0;
    while(c<a.length){
      int d=0;
      while(d<a[c].length){
        a[c][d]=array[c][d];
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