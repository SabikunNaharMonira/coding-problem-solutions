import java.io.IOException;
import java.util.Scanner;

public class beecrowd1021 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        int n = (int) Math.round(input * 100); 

        System.out.println("NOTAS:");
        int note = n / 10000; 
        System.out.println(note + " nota(s) de R$ 100.00");
        n %= 10000;

        note = n / 5000; 
        System.out.println(note + " nota(s) de R$ 50.00");
        n %= 5000;

        note = n / 2000;
        System.out.println(note + " nota(s) de R$ 20.00");
        n %= 2000;

        note = n / 1000; // 10.00 = 1000 cents
        System.out.println(note + " nota(s) de R$ 10.00");
        n %= 1000;

        note = n / 500; // 5.00 = 500 cents
        System.out.println(note + " nota(s) de R$ 5.00");
        n %= 500;

        note = n / 200; // 2.00 = 200 cents
        System.out.println(note + " nota(s) de R$ 2.00");
        n %= 200;

        System.out.println("MOEDAS:");
        note = n / 100;
        System.out.println(note + " moeda(s) de R$ 1.00");
        n %= 100;

        note = n / 50;
        System.out.println(note + " moeda(s) de R$ 0.50");
        n %= 50;

        note = n / 25; 
        System.out.println(note + " moeda(s) de R$ 0.25");
        n %= 25;

        note = n / 10;
        System.out.println(note + " moeda(s) de R$ 0.10");
        n %= 10;

        note = n / 5; 
        System.out.println(note + " moeda(s) de R$ 0.05");
        n %= 5;

        note = n; 
        System.out.println(note + " moeda(s) de R$ 0.01");
    }
}
