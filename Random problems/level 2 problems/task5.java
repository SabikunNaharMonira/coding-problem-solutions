public class task5{
  public static void main(String arg[]){
    int count=1;
    int sum=0;
    while(count<=600){
      if(count%7==0 ^ count%9==0){
        
        sum=sum+count;
      }
      count++;
    }
    System.out.println(sum);
  }
}
