import java.util.Scanner;

public class MinOperationsToZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Number of test cases
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline after the integer input
        
        // Process each test case
        while (t-- > 0) {
            String s = scanner.nextLine();
            int count = 0;
            
            // Count distinct blocks of '1's
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1' && (i == 0 || s.charAt(i - 1) == '0')) {
                    count++;
                }
            }
            
            // Output the result for this test case
            System.out.println(count);
        }
        
        scanner.close();
    }
}
