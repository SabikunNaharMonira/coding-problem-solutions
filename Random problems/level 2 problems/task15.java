public class task15 {
    public static void main(String[] args) {
        int num = 6;
        int diviser = 0;
        for (int i = 1; i < num; i++) {
          if (num % i == 0) {
            diviser += i; 
          }
        }
        if (diviser == num) {
          System.out.println(num + " is a perfect number");
        }
        else {
          System.out.println(num + " is not a perfect number");
        }
    }
}

