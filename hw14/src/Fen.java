public class Fen implements Device, Move{
    @Override
    public void on() {
        System.out.println("Фен включен");
    }

    @Override
    public void off() {
        System.out.println("Фен выключен");

    }

    @Override
    public void Move() {
        System.out.println("Вы можете взять фен");
    }
}
