public class WideAnimalNotEnum {
    private final String name;
    private final int ordinal;
    private final String food;
    private final int amount;

    private WideAnimalNotEnum(String name, int ordinal, String food, int amount) {
        this.name = name;
        this.ordinal = ordinal;
        this.food = food;
        this.amount = amount;
    }

    private static final WideAnimalNotEnum[] values;

    static {
        values = new WideAnimalNotEnum[]{
                new WideAnimalNotEnum("MONKEY", 0, "bananas", 5),
                new WideAnimalNotEnum("ELEPHANT", 1, "raspberries", 30),
                new WideAnimalNotEnum("GIRAFFE", 2, "apples", 10),
                new WideAnimalNotEnum("RACCOON", 3, "walnuts", 20)
        };
    }

    public static WideAnimalNotEnum[] values() {
        return values;
    }

    public String name() {
        return name;
    }

    public int ordinal() {
        return ordinal;
    }

    public static String listAllAnimals() {
        StringBuilder sb = new StringBuilder();
        for (WideAnimalNotEnum animal : WideAnimalNotEnum.values()) {
            sb.append(animal.ordinal()).append(": ");
            sb.append(animal.name());
            sb.append(" desires eating ").append(animal.amount * 7).append(" ");
            sb.append(animal.food).append(" a week.");
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    public String toString() {
        return "A(n) " + this.name() + " eats " + this.amount + " " + this.food + " a day.";
    }

}
