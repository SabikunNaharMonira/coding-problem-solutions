//done
import java.util.Scanner;
import java.util.Arrays;
public class ass6task5{
  public static void main (String args[]){
    Scanner sc= new Scanner(System.in);
    //bulding array
    System.out.print("N = ");
    int n = sc.nextInt();
    int [] arr = new int[n];
    for(int i =0 ; i <n ; i++){
      System.out.print("Enter a number: ");
      arr[i]=sc.nextInt();
    }
    //checking elements
    System.out.print("enter a number: ");
    int x=sc.nextInt();
    boolean flag=false;
    for(int i=0; i<n ; i++){
      if(arr[i]==x){
        System.out.println(x+" is at index "+i);
        flag=true;
        break;
        
      }
    }
    if(flag==false){
      System.out.println("Element not found");
    }
  }
}
     