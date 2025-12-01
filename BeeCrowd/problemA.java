import java.util.Scanner;

public class problemA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // Read the binary string
            String s = sc.next();
            
            int blocksOfOnes = 0;
            boolean inBlock = false;
            
            // Traverse the string and count the blocks of '1's
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                
                if (c == '1') {
                    if (!inBlock) {
                        blocksOfOnes++;
                        inBlock = true;
                    }
                } else {
                    inBlock = false;
                }
            }
            
            // Output the result for the current test case
            System.out.println(blocksOfOnes);
        }
        
        sc.close();  // Close the scanner
    }
}
