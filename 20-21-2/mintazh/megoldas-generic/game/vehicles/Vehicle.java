package game.vehicles;

import game.utils.VehicleException;

public abstract class Vehicle {
  protected final int id;
  private static int lastId = 0;
  private double currentSpeed;

  private final String color;

  protected Vehicle(String color) {
    this.id = lastId++;
    this.color = color;
  }

  @Override
  public String toString() {
    return Integer.valueOf(id).toString();
  }

  public double getCurrentSpeed() {
    return currentSpeed;
  }

  protected final void accelerateCurrentSpeed(double acc) throws VehicleException {
    if(currentSpeed + acc < 0) {
      throw new VehicleException();
    } else {
      currentSpeed += acc;
    }
  }

  public abstract void accelerate(double amount) throws VehicleException;

  public String getColor() {
    return color;
  }
}
