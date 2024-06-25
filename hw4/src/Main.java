import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int x = 0;
    static int y = 0;
    public static void main(String[] args) {
        while (true) {
            int command = inputCommand();
            int steps;
            if (command == 1) {
                y -= inputSteps();
            } else if (command == 2) {
                y += inputSteps();
            } else if (command == 3) {
                x += inputSteps();
            } else if (command == 4) {
                x -= inputSteps();
            } else if (command == 5) {
                print();
            } else {
                error();
            }
        }
    }
    private static void error() {
        System.out.println("Команда не верна");
    }
    private static void print () {
            System.out.println("Координаты:x= " + x + ",y= " + y);
        }
    private static int inputSteps () {
            System.out.println("Введите кол-во шагов");
            return new Scanner(System.in).nextInt();
        }
    private static int inputCommand () {
            System.out.println("Введите команду:\n1-пойти вниз\n2-пойти вверх\n3-пойти направо\n4-пойти налево\n5-узнать координаты робота");
            return new Scanner(System.in).nextInt();
        }
    }