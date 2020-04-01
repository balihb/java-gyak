package auto;
import auto.utils.Color;

public class Auto {
    private String licencePlate;
    private Color color;
    private int maxSpeed;

    private static int counter = 0;

    public Auto(String lp, Color color, int ms ){
        counter++;
        this.maxSpeed = ms;
        this.licencePlate = lp;
        this.color = color;
    }

    public boolean firstIsFasterThenSecond(Auto first,Auto other){
        return first.maxSpeed > other.maxSpeed;
    }
}

