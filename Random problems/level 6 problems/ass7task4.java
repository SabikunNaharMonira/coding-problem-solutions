import java.util.Scanner;
public class ass7task4{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
      boolean check = isPrime(15);
     System.out.println(check);
      boolean check1 = isPerfect(33);
      System.out.println(check1);
      int a= sc.nextInt();
      int result = special_sum(8);
      System.out.println(result);
  }
  public static boolean isPrime(int a){
    int count=0;
    boolean prime=false;
    for(int i =1; i<=a ; i++){
      if(a%i==0){
        count++;
      }
    }
    if(count>2){
      prime=false;
      
    }
    else if(count==2){
      prime=true;
    }
    return prime;
  }
  public static boolean isPerfect(int a){
    int sum=0;
    boolean perfect=false;
    for(int i=1; i<a ; i++){
      if(a%i==0){
        sum+=i;
      }
    }
    if(sum==a){
      perfect=true;
    }
    else{
      perfect=false;
    }
    return perfect;
  }
  public static int special_sum(int a){
    int sum=0;
    for(int i=1; i<=a ; i++){
      int count=0;
      int count2=0;
      for(int j=1; j<=i ; j++){
        if(i%j==0){
          count++;
        }
      }
      if(count==2){
        sum+=i;
      }
      else{
      for(int j=1; j<i ; j++){
        if(i%j==0){
          count2+=j;
        }
      }
      if(count2==i){
        sum+=i;
      }
      }
    }
    return sum; 
  } 
}
    
