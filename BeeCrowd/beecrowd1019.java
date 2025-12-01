import java.io.IOException;
import java.util.Scanner;
public class beecrowd1019 {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int h= n/3600;
        n=n-(h*3600);
        int m = n/60;
        n=n-(m*60);
        int s= n;
        System.out.println(h+":"+m+":"+s);
    }
}