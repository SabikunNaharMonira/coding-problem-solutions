public class Player extends SportsPerson{
  public int total_goal;
  public int total_match;
  public double goal_ratio;
  public int total_player;
  
  public Player( String player_name, String team_name , String role, int total_goal, int total_player){
    super(player_name, team_name, role);
    this.total_goal= total_goal;
    this.total_player = total_player;
    total_match=total_player;
  }
  
  
  
  public void calculateRatio(){
    
   this.goal_ratio = total_goal / (double)total_player;
   earningPerMatch= (total_goal * 1000) + (total_match * 10);
    
  }
  
  
  public void printDetails()  {
    System.out.println(super.getNameTeam());
    System.out.println("Team Role: " + role);
    System.out.println("Total Goal: " + total_goal + ", Total Played: " + total_player);
    System.out.printf("Goal Ratio: %.2f\n",goal_ratio);
    System.out.println("Match Earning: " + (int)earningPerMatch + "K");
  }
    
    
    
}