import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       String number = new Scanner(System.in).nextLine();

       int lastNum = Integer.parseInt(String.valueOf(number.charAt(number.length()-1)));
        System.out.println(lastNum);
    }
}