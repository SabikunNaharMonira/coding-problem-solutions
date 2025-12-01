import java.util.Scanner;
public class Task10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line=sc.nextInt();
        for(int i=1; i<=line ; i++){
          for(int j=1; j<=line-i ; j++){
            System.out.print(" ");
          }
          for(int j=1; j<=2*i-1 ; j++){
            System.out.print(j);
          }
          for(int j=1; j<=line-i ; j++){
            System.out.print(" ");
          }
          System.out.println();
        }
    }
}
          