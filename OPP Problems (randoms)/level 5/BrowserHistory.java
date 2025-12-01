public class BrowserHistory{
  
  public int arr_count ;  
  public int count; 
  public int limitVisit;
  public String web [] ;
  
  public BrowserHistory(int limitVisit){
    this.limitVisit = limitVisit;
    this.web = new String [limitVisit];
  }
  
  
  public void showHistory(){
    if(arr_count==0){
      System.out.println("No web pages visited yet.");
    }
    else{
      System.out.println("Browser History:");
      for(int i = 0 ; i< arr_count ; i++){
        System.out.println(web[i]);
      }
    }
  }
  
  public void currentWeb(){
    if(arr_count==0){
      System.out.println("You have not visited any website yet!");
    }
    else{
      System.out.println("Current web page: "+web[arr_count-1]);
    }
  }
  
  public void visitWeb(String toweb){
    if(arr_count >= limitVisit){
      System.out.println("History is full. Cannot visit "+toweb+" web page.");
    }
    else{
      web[arr_count++]=toweb;
      count++;
      System.out.println("Visited: " + toweb);
    }
  }
  
  public void back(){
    if(arr_count>0){
    arr_count= arr_count-1;
    count--;
    }
  }
}
  
  
  