public class task11{
  public static void main(String args[]){
    int total=35;
    int paid=53;
    if(paid>total){
    int change=(paid-total);
    System.out.println("The return amount is "+change+"tk");
    }
    if (paid>total){
      int note100=change/100;
      change=change%100;
       int note50=change/50;
      change=change%50;
       int note20=change/20;
      change=change%20;
       int note10=change/10;
      change=change%10;
       int coin5=change/5;
      change=change%5;
       int coin2=change/2;
      change=change%2;
     int coin1=change/1;
      change=change%1;
    }
      System.out.println("100 taka note: "+note100);
      System.out.println("50 taka note: "+note50);
      System.out.println("20 taka note: "+note20);
      System.out.println("10 taka note: "+note10);
      System.out.println("5 taka coin: "+coin5);
      System.out.println("2 taka coin: "+coin2);
      System.out.println("1 taka coin: "+coin1);
       
    
  }
}