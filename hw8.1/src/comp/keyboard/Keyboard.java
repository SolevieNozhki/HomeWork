package comp.keyboard;

public class Keyboard {
  private KeyboardType type;
  private KeyboardIlluminate illuminate;
  private double weight;

    public Keyboard(KeyboardType type, KeyboardIlluminate illuminate, double weight) {
        this.type = type;
        this.illuminate = illuminate;
        this.weight = weight;
    }

    public KeyboardType getType() {
        return type;
    }

    public void setType(KeyboardType type) {
        this.type = type;
    }

    public KeyboardIlluminate getIlluminate() {
        return illuminate;
    }

    public void setIlluminate(KeyboardIlluminate illuminate) {
        this.illuminate = illuminate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "type=" + type +
                ", illuminate=" + illuminate +
                ", weight=" + weight +
                '}';
    }
}
