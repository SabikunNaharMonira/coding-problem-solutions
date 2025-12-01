public class Tennis_Tournament extends Tournament{
    public int no_player;
  
  public Tennis_Tournament(String a , int no_player){
    super(a);
    this.no_player = no_player;
  }
  
  
  public String detail(){
    String a = "Tennis Tournament Name: "+getName()+
      "\nNumber of Players: "+no_player;
    return a;
  }
  
}