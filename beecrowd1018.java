import java.util.Scanner;
public class beecrowd1018 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=  sc.nextInt();
        System.out.println(n);
        int result= n/100;
        System.out.println(result+" nota(s) de R$ 100,00");
         n = n-(result*100);
         result = n/50;
         System.out.println(result+" nota(s) de R$ 50,00");
         n = n-(result*50);
         result= n/20;
         System.out.println(result+" nota(s) de R$ 20,00");
         n = n-(result*20);
         result=n/10;
         System.out.println(result+" nota(s) de R$ 10,00");
         n = n-(result*10);
         result= n/5;
         System.out.println(result+" nota(s) de R$ 5,00");
         n=n-(result*5);
         result= n/2;
         System.out.println(result+" nota(s) de R$ 2,00");
         n=n-(result*2);
         System.out.println(n+" nota(s) de R$ 1,00");
         
    }
}