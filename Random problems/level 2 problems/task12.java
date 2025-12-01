//ekhane last comma shorano jacche na

public class task12{
  public static void main(String args[]){
    int n=32768;
    int last=0;
      while(n>0){
        last=n%10;
        n=n/10;
        if (last==3){
          System.out.print(last);
        }
        else{
         System.out.print(last+", ");
      }
      }
  }
}

     