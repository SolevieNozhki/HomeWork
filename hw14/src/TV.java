public class TV implements Device {

    @Override
    public void on() {
        System.out.println("Телевизор включен");

    }

    @Override
    public void off() {
        System.out.println("Телевизор выключен");

    }
}
