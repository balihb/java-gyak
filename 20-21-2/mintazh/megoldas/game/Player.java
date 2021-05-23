package game;

import game.vehicles.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Player {
  private final String name;
  private final String ip;
  private int money;
  private List<Car> cars = new ArrayList<>();

  public Player(String name, String ip, int money) {
    if(name != null && ip != null && ! ip.isEmpty() && ! ip.matches(".*\\s.*") && money > 0) {
      this.name = name;
      this.ip = ip;
      this.money = money;
    } else {
      throw new IllegalArgumentException("Nem jo parameterek");
    }
  }

  @Override
  public boolean equals(Object other) {
    if(other == null) return false;
    if(other == this) return true;
    if(other instanceof Player otherPlayer) {
      return otherPlayer.name.equals(name) && otherPlayer.money == money && otherPlayer.cars.equals(cars);
    }

    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, money, cars);
  }
}
