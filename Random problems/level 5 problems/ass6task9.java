//done
import java.util.Scanner;
import java.util.Arrays;
public class ass6task9{
  public static void main (String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print(" Enter the length of the array: ");
    int n= sc.nextInt();
    int temp=0;
    int [] arr=new int[n];
    
    //bulding array
    for( int i =0 ; i<n; i++){
      System.out.print("\n Enter a number: ");
      int x= sc.nextInt();
      arr[i]=x;
    }
    
    //selection sorting
    for(int i=0; i<n ; i++){
      for(int j=i+1; j<n ; j++){
        if(arr[i]<arr[j]){
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    
    //printing sorting values
     for(int i=0; i<arr.length; i++){
          System.out.print(arr[i]+" ");
        }
    System.out.println();
  }
}
          