import java.util.Scanner;
public class contestA{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int t= sc.nextInt();
    int count=0;
    for(int i =1 ; i<=t ; i++){
      String s1=sc.nextLine();
      for(int j=0 ; j<s1.length() ; j++){
        if(s1.charAt(i)==1){
          count++;
        }
      }
      System.out.println(count);
      count=0;
    }
  }
}
    