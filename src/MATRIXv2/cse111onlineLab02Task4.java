package MATRIXv2;
/*Task 4: 
Write a java program that creates an M by N matrix, where M and N will be given by the user, containing random values between 0 and 1. 
You need to make use of a random number generator here that generates values between 0 and 1 and assign that to the cells of the matrix.
Find out how to generate random numbers from the internet. Note that your matrix should be able to hold real numbers as well as integers. 
*/
import java.util.Scanner;
public class cse111onlineLab02Task4{
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
        if(d%2!=0){
          System.out.print(a[c][d]+" ");
        }else{
          a[c][d]=1;
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