public class Cricket_Tournament extends Tournament{
    public int team;
  public String type=" No type";
  
  public Cricket_Tournament(){
  }
  
  public Cricket_Tournament(String a , int team , String type ){
    super(a);
    this.team = team;
    this.type=type;
  }
  
  
  public String detail(){
    String a = "Cricket Tournament Name: "+getName()+
      "\nNumber of Teams: "+team+" \nType: "+ type;
    return a;
  }
  
  
}