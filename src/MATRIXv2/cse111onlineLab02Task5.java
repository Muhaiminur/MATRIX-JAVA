package MATRIXv2;
/*Task 5:

Write a java program that creates the N by N identity matrix where N is given by the user. 

You should already know from high school math what an identity matrix is. If you do not know, or you have forgotten, then Google is your friend.
*/
import java.util.Scanner;
public class cse111onlineLab02Task5{
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
        if(c==d){
          a[c][d]=1;
          System.out.print(a[c][d]+" ");
        }else{
          System.out.print(a[c][d]+" ");
        }
        d++;
      }
      System.out.print("]");
      c++;
      System.out.println();
    }
  }
}