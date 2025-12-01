import java.util.Scanner;
public class task2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num=0;
    for (int i=1; num>=0 ;i++){
      System.out.print("Enter Number: ");
       num=sc.nextInt();
       if(num>0){
       System.out.println("");
       int sqrt= num*num;
         System.out.println(num+"^"+num+"="+sqrt);
       }
    }
  }
}