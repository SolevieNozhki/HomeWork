import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final String VALID_REGEX = "([А-яё-]+\\s){2}([А-яё-]+)";
    public static void main(String[] args) {
        System.out.println("Введите ФИО");
        String fio = new Scanner(System.in).nextLine();
        if(fio.matches(VALID_REGEX)){
            String[] split = fio.split("\\s+");
            System.out.println("Фамилия: "+ split[0]);
            System.out.println("Имя: "+ split[1]);
            System.out.println("Отчество: "+ split[2]);
        }else {
            System.out.println("Введенная строка не является ФИО");
        }
     }
}

