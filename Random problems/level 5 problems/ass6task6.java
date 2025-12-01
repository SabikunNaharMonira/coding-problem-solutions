//done
import java.util.Scanner;
import java.util.Arrays;
public class ass6task6{
  public static void main (String args[]){
    Scanner sc= new Scanner(System.in);
    double max = Integer.MIN_VALUE;
   double min = Integer.MAX_VALUE;
   int maxindex=0;
   int minindex=0;
   double sum=0;
   
   //bulding array
    System.out.print("Enter the length of the array: ");
    int n=sc.nextInt();
    double [] arr1=new double[n];
    for(int i=0; i<n; i++){
      System.out.print("Enter a number: ");
      arr1[i]=sc.nextDouble();
    }
    //calculating sum and taking max min
    for(int i=0; i<n ; i++){
      sum+= arr1[i];
      if(arr1[i]>max){
        max=arr1[i];
         maxindex=i;
      }
      if(arr1[i]<min){
        min=arr1[i];
        minindex=i;
      }
    }
    System.out.println();
     System.out.println("Maximum element "+max+" found at index "+maxindex);
    System.out.println("Minimum element "+min+" found at index "+minindex);
    System.out.println("Summation: "+sum);
    System.out.printf("Average: %.2f\n",sum/n);
  }
}
      
      