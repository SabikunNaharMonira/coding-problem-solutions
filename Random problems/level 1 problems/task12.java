//checked
public class task12{
    public static void main(String[] args){
        int num1=23;
        int num2=2;
        int num3=2;
        if (num1==num2 && num2==num3) {
            System.out.println("All numbers are equal");
        }
        else if (num1!=num2 && num2!=num3 && num1!=num3) {
            System.out.println("All numbers are different");
        } 
        else {
            System.out.println("Neither all are equal or different");
        }
    }
}
