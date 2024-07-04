package comp.cpu;

public class Processor {
    private Rate rate;
    private CoreCount core;
    private Producer producer;
    private double weight;

    public Processor(Rate rate, CoreCount core, Producer producer, double weight) {
        this.rate = rate;
        this.core = core;
        this.producer = producer;
        this.weight = weight;
    }

    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }

    public CoreCount getCore() {
        return core;
    }

    public void setCore(CoreCount core) {
        this.core = core;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "rate=" + rate +
                ", core=" + core +
                ", producer=" + producer +
                ", weight=" + weight +
                '}';
    }
}
