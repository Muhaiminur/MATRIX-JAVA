package MATRIXv2;
/*Task 10:
Write a java program that, given two matrices, check if they are equal.
Here you need to compare two matrices value by value and find out if they are equal or not. 
*/
import java.util.Scanner;
public class cse111onlineLab02Task10{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    double [][] a={{1, 2, 3},{2, 3, 4}};
    double [][] a1={{3, 4, 5}, {6, 7, 8}};
    double [][] aa={{1, 2, 3},{2, 3, 4}};
    boolean ulta = true;
    int c=0;
    while(c<a.length){
      int d=0;
      while(d<a[c].length){
        if(a[c][d]==a1[c][d]){
          ulta=true;
        }
        else{
          ulta=false;
          break;
        }
        d++;
      }
      c++;
      System.out.println();
    }
    System.out.println("apnar result hoche"+ulta);
    boolean same = true;
     c=0;
    while(c<a.length){
      int d=0;
      while(d<a[c].length){
        if(a[c][d]==aa[c][d]){
          same=true;
        }
        else{
          same=false;
          break;
        }
        d++;
      }
      c++;
      System.out.println();
    }
    System.out.println("apnar result hoche"+same);
  }
}