package main;

import game.Player;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Player zorro = loadPlayerFromFile("Zorror");
    Player daniel = loadPlayerFromFile("Daniel");
    //Player peter = loadPlayerFromFile("Peter");
    Player richard = loadPlayerFromFile("Richard");
    Player tamas = loadPlayerFromFile("Tamas");
    //Car c1 = loadPlayerFromFile("Zorro");
    //Car c2 = new Car();
    //Car c3 = new Car();
    //System.out.println(c1);
  }

  public static Player loadPlayerFromFile(String playerName){
    File input = new File("users/" + playerName + ".txt");

    String[] data = null;
    try (BufferedReader bf = new BufferedReader(new FileReader(input))){
        String line = bf.readLine();
        data = line.split(" ");

        return new Player(playerName, data[0], Integer.valueOf(data[1]));
    } catch (IOException e) {
        System.out.println("IO error occured: " + e.getMessage());
    } catch(NumberFormatException e) {
      return new Player(playerName, data[0], 0);
    }

    return null;
}

}