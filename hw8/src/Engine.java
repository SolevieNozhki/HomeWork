public class Engine {
    private String mark;
    private double volume;

    public Engine(String mark, double volume) {
        this.mark = mark;
        this.volume = volume;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
