//checked
public class task3{
  public static void main(String args[]){
    
     int num1=36;
            if (num1%5==0 &&  num1%7==0){
                System.out.println ("Divisible by Both");
            }
            else if ( num1%5==0 && num1%7!=0){
                System.out.println ("Invalid: Divisible by 5 Only");
            }
            else if ( num1%5!=0 && num1%7==0){
                System.out.println ( "Invalid: Divisible by 7 Only");
            }
            else {
                System.out.println ("No");
            }
  }
}