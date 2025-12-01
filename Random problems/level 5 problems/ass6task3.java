//done
import java.util.Scanner;
import java.util.Arrays;
public class ass6task3{
  public static void main (String args[]){
    Scanner sc= new Scanner(System.in);
    //making new array
    System.out.print(" Enter the length of the array: ");
    int n= sc.nextInt();
    int [] arr1=new int[n];
    for( int i =0 ; i<arr1.length ; i++){
      System.out.print("\n Enter a number: ");
      int x= sc.nextInt();
      arr1[i]=x;
    }
  //making a new array in reversive order
    int [] arr2=new int[n];
    int last_index=n-1;
    for(int i=0 ; i<n ; i++){
     arr2[last_index]= arr1[i];
     last_index--;
    }
    //printing new erversed array
    System.out.println("Reversed using a new array");
    for(int i =0 ; i <arr2.length ; i++){
      System.out.print(arr2[i]+" ");
    }
    System.out.println();
    //reversing 1st array;
    for(int i =0 ; i <arr1.length/2 ; i++){
      int temp = arr1[n-1-i];
      arr1[n-1-i]=arr1[i];
      arr1[i]=temp;
    }
    //printing reversed frist array
    System.out.println("Reversed the original array");
    for(int i =0 ; i <arr1.length ; i++){
      System.out.print(arr1[i]+" ");
    }
  }
}
      
        