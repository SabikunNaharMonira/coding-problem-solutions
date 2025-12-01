import java.util.Scanner;
public class ass7task6{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    double t = calcTax(20, 18000);
    System.out.println(t);
    calcYearlyTax();
  }
  public static double calcTax(int a,int b){
    boolean g=true;
    if(a<18){
      g=false;
    }
    else if(b<10000){
      g=false;
    }
    double tax=0.0;
    if(g){
      if(b>=10000 && b<=20000){
        tax=b*(7.0/100);
      }
      else if(b>20000){
        tax=b*(14.0/100);
      }
    }
    else{
      tax=0.0;
    }
    return tax;
  }
  public static void calcYearlyTax(){
    Scanner sc= new Scanner(System.in);
    int age =sc.nextInt();
    int salary;
    double tax;
    double sum=0.04;
    for(int i=1; i<=12 ; i++){
      salary=sc.nextInt();
      tax=calcTax(age,salary);
      System.out.println("Month "+i+" tax: "+tax);
      sum+=tax;
    }
    System.out.println("Total Yearly Tax: "+sum);
  }
}
    