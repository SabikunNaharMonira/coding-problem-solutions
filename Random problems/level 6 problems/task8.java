import java.util.Scanner;
public class ass7task8{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    reverseDigits(n);
  }
  public static void reverseDigits(int n){
    if(n==0){
      return;
    }
    else{
      System.out.println(n%10);
      reverseDigits(n/10);
    }
    
    
    
    
    
  }
    
}
