public class task6{
  public static void main(String args[]){
    int n=5;
    int count=1;
      int y=0;
      while(count<=n){
      if(count%2==0){
         y= y-count*count;
      }
      else {
        y= y+count*count;
      }
        count++;
      }
      System.out.println(y);
  }
}
        
        