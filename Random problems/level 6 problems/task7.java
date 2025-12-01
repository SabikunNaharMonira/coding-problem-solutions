import java.util.Scanner;
public class ass7task7{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int N= sc.nextInt();
    oneToN(1,N);
    nToOne(1,N);
    int sum = recursiveSum(1,N);
    System.out.println(sum);
  }
  public static void oneToN(int a,int n){
    for(int i=a; i<=n ; i++){
      System.out.print(i+" ");
    }
    System.out.println();
  }
  public static void nToOne(int a,int n){
    for(int i=n ; i>0 ;i--){
      System.out.print(i+" ");
    }
    System.out.println();
  }
  public static int recursiveSum(int a, int n){
    if(n==0){
      return 0;
    }
    else{
      return n+recursiveSum(a ,n-1);
  }
}
}
