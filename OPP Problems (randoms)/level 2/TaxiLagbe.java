public class TaxiLagbe{
  public String taxNum="";
  public String cov="";
  public int fare;
  public int t=0;
  public String [] arr= new String[4];
  public int count = 0;
  public void storeInfo(String tnum , String loc){
    this.taxNum=tnum;
    this.cov=loc;
  }
  public void printDetails(){
    System.out.println("Taxi number: "+this.taxNum
                         +"\nThis taxi can cover "+cov+" area");
    System.out.println("Total Passenger: "+t);
    System.out.println("Passenger Lists:");
    if(count>0){
      for(int i =0 ; i<count ; i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println();
    }
    System.out.println("Total collected fare: "+fare+" Taka");
    
  }
  public void addPassenger(String name, int fare){
    if(count<arr.length){
    System.out.println("Dear "+name+"! Welcome to TaxiLagbe");
    this.t+=1;
    this.arr[count]=name;
    count++;
    this.fare+=fare;
    }
    else{
      System.out.println("Taxi Full! No more passengers can be added");
    }
  }
  public void addPassenger(String name1, int fare1, String name2, int fare2){

    if(count<arr.length){
    System.out.println("Dear "+name1+"! Welcome to TaxiLagbe");
    this.arr[count]=name1;
    this.fare+=fare1;
    count++;
    this.t+=1;
    }
     else{
      System.out.println("Taxi Full! No more passengers can be added");
      return;
    }
    if(count<arr.length){
    System.out.println("Dear "+name2+"! Welcome to TaxiLagbe");
    this.arr[count]=name2;
    this.fare+=fare2;
    count++;
    this.t+=1;
    }
    else{
      System.out.println("Taxi Full! No more passengers can be added");
      return;
    }
  }
}