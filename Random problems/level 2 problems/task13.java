public class task13 {
    public static void main(String args[]) {
        int n = 32768;  
        int m = n;      
        int digit = 0;
         int divisor = 1;
        while (n > 0) {
            n = n / 10;
            digit += 1;
        }
        for (int i = 1; i < digit; i++) {
            divisor *= 10;
        }
        while (divisor > 0) {
            int num = m / divisor;  
            System.out.print(num);   
            m = m % divisor;                
            divisor = divisor / 10; 
            if (divisor > 0) {
                System.out.print(", ");
            }
        }
    }
}
