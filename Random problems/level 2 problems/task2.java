public class task2{
  public static void main(String args[]){
    for(int i=2; i<7 && i>=2 ; i+=1){
      if(i%2==0){
        int num=9*i;
      System.out.print(num+", ");
      }
      if(i%2!=0){
       int num=-9*i;
        System.out.print(num+", ");
      }
    }
    System.out.print("-63");
  }
}