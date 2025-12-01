import java.util.Scanner;
public class task3{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int countpositive=0;
    int countneg=0;
    System.out.print("Enter an integer: ");
      int integer=sc.nextInt();
    for(int i=1; i<=integer ; i++){
      System.out.print("Enter number "+i+": ");
      int input=sc.nextInt();
      if(input>=0){
        countpositive++;
      }
      else if(input<0){
        countneg++;
      }
    }
    System.out.println(countpositive+" Non-negative Numbers");
    System.out.println(countneg+" Negative Numbers");
  }
}