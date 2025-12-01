//done
import java.util.Scanner;
import java.util.Arrays;
public class ass6task2{
  public static void main (String args[]){
    Scanner sc= new Scanner(System.in);
    int [] arr1={9, -5 , 7, 9, -5, 5, 7};
    for(int i =0; i<arr1.length ; i++){
      
      for(int k=i+1 ; k<arr1.length ; k++){
        if(arr1[i]==arr1[k]){
          arr1[k]=0;
        }
      }
    }
       for(int i=0; i<arr1.length; i++){
          System.out.print(arr1[i]+" ");
        }
    System.out.println();
  }
}
          