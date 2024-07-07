//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Body body = new Body("Купе");
        Wheels wheels = new Wheels(4);
        Engine engine = new Engine("Audi", 4.0);

        Car car = new Car(wheels, engine, body);
        System.out.println("Марка машины: "+car.getEngine().getMark());

    }
}