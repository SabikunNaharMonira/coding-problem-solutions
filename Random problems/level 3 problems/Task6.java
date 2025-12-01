import java.util.Scanner;
public class Task6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=sc.nextInt();
        while(num%2==0){
          int count=0;
           for(int i=1; i<=num ; i++){
             if(num%i==0){
               count++;
             }
           }
           System.out.println(num+" has "+count+" Divisor");
           System.out.print("Enter Number: ");
           int num2=sc.nextInt();
           num=num2;
        }
    }
}

        
        //}
        //System.out.println(num+" has"+count+" Divisor");
   // }
//}