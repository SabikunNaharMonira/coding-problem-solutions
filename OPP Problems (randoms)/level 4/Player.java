public class Player {
  public static String[] arr = new String[11];
  public static int total = 0;
  
  public String player_name;
  public String country_name;
  public int s_num;
  
  public Player(String name, String con, int num) {
    this.player_name = name;
    this.country_name = con;
    this.s_num = num;
    arr[total++] = name;
  }
  
  public String player_detail() {
    String details = "Player Name: " + player_name +
      "\nJersey Number: " + s_num +
      "\nCountry: " + country_name;
    return details;
  }
  
  public static void info() {
    System.out.print("Total number of players: " + total + "\nPlayers enlisted so far:");
    for (int i = 0; i < total; i++) {
      if (i == 0) System.out.print(" " + arr[i]);
      else System.out.print(", " + arr[i]);
    }
    System.out.println();
  }
}
