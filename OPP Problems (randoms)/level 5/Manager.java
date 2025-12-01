public class Manager extends SportsPerson{
  public int match_win;
  
  public Manager(String team_name, String name, String role, int match_win) {
    super(team_name, name, role);
    this.match_win = match_win;
  }
  
  public void calculateEarnings() {
    this.earningPerMatch = match_win * 1000;
  }
  public void printDetails() {
    System.out.println(super.getNameTeam());
    System.out.println("Team Role: " + role);
    System.out.println("Total Win: " + match_win);
    calculateEarnings();
    System.out.println("Match Earning: " + (int)earningPerMatch + "K");
  }
  
  
}