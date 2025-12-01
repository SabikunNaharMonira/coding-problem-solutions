import java.util.Scanner;
import java.util.Arrays;
public class ass6task8{
  public static void main (String args[]){
    Scanner sc= new Scanner(System.in);
    //making array 1
    System.out.print("Please enter the length of the array 1");
    int n=sc.nextInt();
      int arr[]=new int[n];
    System.out.println("please ener the elements of array 1");
    for(int i=0; i<n; i++){
    arr[i]=sc.nextInt();
    }
    //making array 2
     System.out.print("Please enter the length of the array 2");
    int m=sc.nextInt();
      int arr2[]=new int[m];
    System.out.println("please ener the elements of array 2");
    for(int i=0; i<m; i++){
    arr2[i]=sc.nextInt();
    }
    //comparing each elements
    int count=0;
    for(int i=0; i<arr2.length ; i++){
      for(int j=0; j<arr.length ; j++){
        if(arr2[i]==arr[j]){
          count++;
        }
      }
    }
    //printing results
    if(count==arr2.length){
      System.out.println("array 2 is a subset of array 1");
    }
    else{
      System.out.println("array 2 is not a subset of array 1");
    }
  }
}
      