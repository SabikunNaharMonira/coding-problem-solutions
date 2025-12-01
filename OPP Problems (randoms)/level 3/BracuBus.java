public class BracuBus{
  public String des ="";
  public int count = 0;
  public int total = 0;
  public String [] board ;
  
  public BracuBus(String des){
    this.des = des ;
    this.total = 2;
    board= new String [2];
  }
  public BracuBus(String des ,int a){
    this.des = des ;
    this.total = a;
    board = new String [a];
  }
  public void board(){
    System.out.println("No passengers");
  }
  public void board(BracuStudent s){
    if(count<total){
      if(s.pass){
        if(s.des==this.des){
          board[count++]=s.name;
          System.out.println(s.name+" boarded the bus.");
        }
        else{
          System.out.println("You got on the wrong bus!");
        }
      }
      else{
        System.out.println("You don't have a bus pass!");
      }
    }
    else{
      System.out.println("Bus is full!");
    }
  }
  
  
  public void board(BracuStudent s1, BracuStudent s2){
    board(s1);
    board(s2);
  }
  public void showDetails(){
    System.out.printf("Bus Route: "+this.des+
                      "\nPassenger Count: "+this.count+
                      " (Max: "+this.total+")\n");
    System.out.println("Passengers on Board: ");
    for(int i= 0 ; i<count ; i++){
      System.out.print(board[i]+" ");
    }
    System.out.println();
  }
}
  