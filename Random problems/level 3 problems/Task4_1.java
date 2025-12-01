import java.util.Scanner;
public class Task4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numin = sc.nextInt();
        int numout = 0;  
        int num = 2;    
        while (numout < numin) {
            int count = 0;  
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(num);
                numout++;
            }
            num++;
        }
    }
}
