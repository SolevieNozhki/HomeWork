package comp.harddisk;

public class HardDrive {
   private HardDriveType type;
   private int volume;
   private double weight;

    public HardDrive(HardDriveType type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public HardDriveType getType() {
        return type;
    }

    public void setType(HardDriveType type) {
        this.type = type;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "type=" + type +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}
