import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        print();
    }

    public static void print() {
        System.out.println(getInput() % 2 == 0);
    }

    public static int getInput() {
        System.out.println("Введите чётное число: ");
        return new Scanner(System.in).nextInt();
    }
}
