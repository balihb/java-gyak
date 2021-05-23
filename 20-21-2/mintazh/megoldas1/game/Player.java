package game;

public class Player {
  private final String name;
  private final String ip;
  private int money;

  public Player(String name, String ip, int money) {
    if(name != null && ip != null && ! ip.isEmpty() && ! ip.matches(".*\\s.*") && money > 0) {
      this.name = name;
      this.ip = ip;
      this.money = money;
    } else {
      throw new IllegalArgumentException("Nem jo parameterek");
    }
  }
}