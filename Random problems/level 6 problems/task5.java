import java.util.Scanner;
public class ass7task5{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    showDots(5);
    show_palindrome(5);
    showDiamond(5);
  }
  public static void showDots(int a){
    for(int i=0; i<=a; i++){
      System.out.print(".");
    }
    System.out.println();
  }
  public static void show_palindrome(int a){
    for(int i=1; i<=a ; i++){
      System.out.print(i);
    }
    for(int i=a-1; i>0 ; i--){
      System.out.print(i);
    }
    System.out.println();
  }
  public static void showDiamond(int a){
    //upper half 
    for(int j=1; j<=a; j++){
      //frist space
      for(int i=1; i<=a-j ; i++){
        System.out.print(".");
      }
      //frist digits
      for(int i=1; i<=j ; i++){
        System.out.print(i);
      }
      //last digits
      int n=j;
      for(int i=j-1 ; i>0 ; i--){
        System.out.print(i);
      }
      //last space
      for(int i=1; i<=a-j ; i++){
        System.out.print(".");
      }
      System.out.println();
    }
    //second half
    for(int j=a; j>1 ; j--){
      //frist space
      for(int i=1; i<=a+1-j ; i++){
        System.out.print(".");
      }
      //frist digits
      for(int i=1; i<j ; i++){
        System.out.print(i);
      }
      //last digits
      int n=j;
      for(int i=n-2; i>0 ;i--){
        System.out.print(i);
      }
      //last space
      for(int i =1; i<=a+1-j; i++){
        System.out.print(".");
      }
      System.out.println();
    }
  }
}
