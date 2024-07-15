//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Fen fen = new Fen();
        Lamp lamp = new Lamp();
        TV tv = new TV();

        controller.powerOn(fen);
        controller.powerOff(tv);


        Mover mover = new Mover();

        mover.move(fen);
        mover.move(lamp);
    }
}