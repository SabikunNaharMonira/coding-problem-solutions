import java.util.Scanner;
public class ass8task4{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int n =sc.nextInt();
    boolean check = isHappyNumber(n);
    System.out.println(check);
      
  }
  public static boolean isHappyNumber(int a){
    int x=sqrSum(a);
    while(x!=1 && x!=a){
      x=sqrSum(x);
    }
    return x==1; 
  }
  public static int sqrSum(int a){
    int count =0;
    int x= a;
    do{
      x=x/10;
      count++;
    }while(x>0);
    int r=0;
    for(int i=1 ; i<=count ; i++){
      x=a%10;
      r+=Math.pow(x,2);
      a/=10;
    }
    return r;
  }
  
}
