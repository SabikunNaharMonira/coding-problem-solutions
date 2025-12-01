//done
import java.util.Scanner;
import java.util.Arrays;
public class ass6task4{
  public static void main (String args[]){
    Scanner sc= new Scanner(System.in);
    
    //bulding array
    System.out.print("N: ");
    int n= sc.nextInt();
    int [] arr1= new int[n];
      for(int i=0; i<n ; i++){
        int x=sc.nextInt();
        arr1[i]=x;
      }
      
      //printing original array
       System.out.println("Original array: ");
    for(int i=0; i<n ; i++){
      System.out.print(arr1[i]+" ");
    }
    System.out.println();
    
    //modifying original array
    for(int i=0; i<n ; i++){
      if(arr1[i]>0){
        arr1[i]=1;
      }
      else{
        arr1[i]=0;
      }
    }
    
    //printing modyfied one
    System.out.println("After modifying: ");
    for(int i=0; i<n ; i++){
      System.out.print(arr1[i]+" ");
    }
  }
}
    