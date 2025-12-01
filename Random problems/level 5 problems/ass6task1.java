//done
import java.util.Scanner;
import java.util.Arrays;
public class ass6task1{
  public static void main (String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("N = ");
    int n=sc.nextInt();
    int [] arr1=new int[n];
    System.out.println();
    for(int i=0; i<arr1.length ; i++){
      System.out.print("Enter a number: ");
      int x= sc.nextInt();
      arr1[i]=x;
      System.out.println();
    }
    for(int i=0; i<arr1.length ; i++){
      System.out.println(i+": "+arr1[i]);
    }
    int[]arr2= new int[n+1];
    for(int i=0; i<arr1.length ; i++){
      arr2[i]=arr1[i];
    }
    System.out.print("enter another number: ");
    int n2=sc.nextInt();
    arr2[n]=n2;
    System.out.println();
    System.out.println("After resizing the array:");
    for(int i=0; i<arr2.length; i++){
          System.out.print(arr2[i]+" ");
        }
    System.out.println();
  }
}