public class task8 {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int oddNumber = 1;
        System.out.println("The odd numbers are:"); 
        for (int i = 1; i <= n; i++) {
            sum += oddNumber;  
            System.out.println(oddNumber);
            oddNumber += 2;    
        }
        System.out.println("The Sum of odd Natural Numbers up to "+ n +" terms is: " + sum);
    }
}

