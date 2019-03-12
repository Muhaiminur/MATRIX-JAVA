package matrix.java;
/*PROBLEM 21) Hollow  Triangle � Isosceles
Draw triangle of given height
Sample input 1:
3
Sample output 1:
  1
 1 3
12345

Sample input 2:
4
 
Sample output 2:
   1
  1 3
 1   5
1234567
*/
import java.util.Scanner;
public class CSE110Lab06task21{
  public static void main(String[]Args){
    Scanner abir=new Scanner(System.in);
    System.out.println("entar anum");
    int x=abir.nextInt();
    System.out.println("Sample output");
    int c=1;
    while(c<x){
      System.out.println();
      int d=1;
      while(d<=(x-c)){
        System.out.print(" ");
        d++;
      }
      int e = 1;
      while (e<=(2*(c)-1)){
        if(e==1) 
        {
          System.out.print (e);
        }
        else 
        {
          if (e==2*(c)-1)
          {
            System.out.print (e);
          }
          else 
          {
            System.out.print (" ");
          }
        }
        e++;
      }
      c++;
    }
    System.out.println();
    int f = 1;
    while (f<=(2*x-1))
    {
      System.out.print(f);
      f++;
    }
    System.out.println();
    System.out.println("=======================================================");
  }
}