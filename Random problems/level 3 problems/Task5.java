import java.util.Scanner;
public class Task5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y=0;
        System.out.print("The value of N: ");
        int n=sc.nextInt();
          
          for(int i =1; i<=n ; i++){
          int sum=0;
          for(int j=1; j<=i; j++){
            sum+=j;
          }
          y=y-sum;
        }
        System.out.println("The value of y: "+y);
    }
}