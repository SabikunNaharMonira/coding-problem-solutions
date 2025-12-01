//checked
public class task15 {
    public static void main(String[] args) {
        int sum = 0;
        int digit = 200;
        for (int i = 1; i <= 200; i++) {
            sum += i;
        }
        double average = (double) sum / digit;
        System.out.println("Sum " + sum);
        System.out.println("Average " + average);
    }
}
