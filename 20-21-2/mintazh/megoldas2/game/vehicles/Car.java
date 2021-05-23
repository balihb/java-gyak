package game.vehicles;

import game.utils.VehicleException;

public class Car extends Vehicle{
  private final int maxSpeed;
  private final int cost;

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
    return "" + id + maxSpeed + cost;
  }
}