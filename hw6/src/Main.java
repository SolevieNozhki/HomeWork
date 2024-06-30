//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Duck number1 = new Duck("Пончик",4,"серая");
        Duck.footCount = 2;
        Duck number2 = new Duck("Гусля",4,"желтая");
        Duck.footCount = 1;
        number1.fly();
        number2.fly();
    }
}