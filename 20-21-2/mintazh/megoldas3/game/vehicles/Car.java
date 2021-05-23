package game.vehicles;

import game.Player;
import game.utils.VehicleException;

public class Car extends Vehicle implements Comparable<Car> {
  private final int maxSpeed;
  private final int cost;

  private Player owner = null;

  public Car(int maxSpeed, int cost) {
    super();
    this.maxSpeed = maxSpeed;
    this.cost = cost;
  }

  public int getCost() {
    return cost;
  }

  public void accelerate(double amount) throws VehicleException {
    if(getCurrentSpeed() + amount <= maxSpeed) {
      accelerateCurrentSpeed(amount);
    }
  }

  @Override
  public String toString() {
    return String.format("%d: %d, %d", id, maxSpeed, cost);
  }

  @Override
  public int compareTo(Car o) {
    if(maxSpeed > o.maxSpeed) return 1;
    if(maxSpeed == o.maxSpeed) {
      return Integer.compare(cost, o.cost);
    }
    return -1;
  }

  public boolean isOwned() {
    return null != owner;
  }

  public void setOwner(Player owner) throws VehicleException {
    if(!isOwned()) {
      this.owner = owner;
    } else {
      throw new VehicleException("Mar valakie az auto: " + toString());
    }
  }
}