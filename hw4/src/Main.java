import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static double a = 0;
    static double b = 0;


    public static void main(String[] args) {
        a = inputDouble();
        b = inputDouble();

        sum();      //Метод суммирования чисел
        multiply(); //Метод умножения чисел
        diff();     //Метод вычитания чисел
        divide();   //Метод деления чисел
    }

    private static void divide() {
        System.out.println(a/b);
    }

    private static void diff() {
        System.out.println(a-b);
    }

    private static void multiply() {
        System.out.println(a*b);
    }

    private static void sum() {
        System.out.println(a+b);
    }

    private static double inputDouble() {
        System.out.println("Введите число");
        return new Scanner(System.in).nextDouble();


    }
}