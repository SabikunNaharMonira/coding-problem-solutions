//checked
public class task9{
  public static void main(String args[]){
    double num1=18.83;
      double num2=-4.02;
      double num3=83.12;
      if(num2>num1 && num2>num3){
          System.out.println("Maximun number is"+num2);
      }
      else if(num3>num1 && num3>num2){
          System.out.println("Maximum number is "+num3);
      }
      else if(num1>num2 && num1>num3){
        System.out.println("Maximum number is "+num1);
      }
     if(num2<num1 && num2<num3){
        System.out.println("Minimum number is "+ num2);
      }
      else if(num3<num1 && num3<num2){
          System.out.println("Minimum number is "+num3);
      }
      else if(num1<num2 && num1<num3){
        System.out.println("Minimum number is "+num1);
      }
  }
}