import java.util.Scanner;
public class asg5task8{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
   String s1=sc.nextLine();
   int count=0;
   String result="";
   for(int i=0; i<s1.length(); i++){
     char x=s1.charAt(i);
     if(x>='A'&&x<='Z' || x>='a' && x<='z'){
       count++;
         if(count%2==0){
         if(x>='A' && x<='Z'){
           result+=x;
         }
         else{
           result+=(char)(x-32);
         }
       }
       else{
         if(x>='A'&& x<='Z'){
           result+=(char)(x+32);
         }
         else{
           result+=x;
         }
       }
     }
     else{
         result+=x;
       }
   }
   System.out.println(result);
  }
}
