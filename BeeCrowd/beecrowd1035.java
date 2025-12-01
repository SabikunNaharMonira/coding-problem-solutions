import java.util.Scanner;
public class beecrowd1035{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();   
    int d=sc.nextInt();
    boolean flag1 = false;
    if(b>c && d>a && c+d>a+b && c>0 && d>0 && a%2==0){
      flag1=true;
    }
      if(flag1){
        System.out.println("Valores aceitos");
      }
      else{
        System.out.println("Valores nao aceitos");
      }
  }
}
      