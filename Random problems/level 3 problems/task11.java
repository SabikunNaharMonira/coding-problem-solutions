import java.util.Scanner;
public class task11{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Start: ");
    int start=sc.nextInt();
    System.out.print("End: ");
    int end=sc.nextInt();
    for(int i=start; i>=start && i<=end ; i++){
      int n=i;
      int y=0;
      int r=0;
      while(n>0){
        r=n%10;
        y=y+r*r*r;
        n=n/10;
      }
      if (y==i){
        System.out.println("Armstrong numbers: ");
        System.out.println(i);
      }
    }
  }
}
