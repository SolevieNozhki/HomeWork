public class Lamp implements Device, Move{

    @Override
    public void on() {
        System.out.println("Лампа включена");
    }

    @Override
    public void off() {
        System.out.println("Лампа выключена");

    }

    @Override
    public void Move() {
        System.out.println("Вы перенесли лампу");
    }
}
