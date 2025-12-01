import java.util.Scanner;
public class asg5task2{
  public static void main(String args[]){
  Scanner sc= new Scanner(System.in);
  String s1=sc.nextLine();
  String result="";
  for(int i=s1.length()-1; i>=0; i--){
    char c =s1.charAt(i);
    result +=c;
  }
  System.out.println(result);
  if(result.equals(s1)){
    System.out.println(true);
  }
  else{
    System.out.println(false);
  }
  }
}