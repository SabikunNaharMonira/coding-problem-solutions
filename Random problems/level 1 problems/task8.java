//checked
public class task8{
  public static void main(String args[]){
     int paid=30000;
       int age=25;
       if (paid<10000 && age>=18){
           System.out.println("Your tax amounts in o Tk");
       }
       else if (paid>10000 && paid<20000 && age>=18){
           double num1= (double)paid*0.05;
           System.out.println("your tex ammounts in "+(int)num1+" Tk");
       }
       else if (paid>20000 && age>=18){
           double num2=(double)paid*0.1;
           System.out.println("your text ammounts in "+(int)num2+" Tk");
       }
       else if(age<18){
           System.out.println("Your tax amounts in o Tk");
       }
  }
}
   
    