//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final String PRINT_VALID = "[А-я]+";
    private static final String NUM_REGEX = "(\\d{3})(\\d{3})(\\d{2})(\\d{2})";
    private static final String NUM_FORMAT = "$2$3$4$5";
    private static final String NUM_FORMAT2 = "$1$2$3$4";
    private static Set<String> phoneBook = new TreeSet<>();
    public static void main(String[] args) {
        System.out.println("\t\tДобро пожаловать в программу для хранения номеров телефонов\n\n");
        while (true) {
            System.out.println("Введите команду или номер телефона: ");
            String telephoneNumber = new Scanner(System.in).nextLine();

             if(telephoneNumber.matches(PRINT_VALID)){
                if(telephoneNumber.equals("Печать")) {
                    print();
                    continue;
                }
                System.out.println("Неверная команда");
                continue;
            }telephoneNumber = telephoneNumber.replaceAll("\\D+","");
                if(telephoneNumber.length() == 11){
                    telephoneNumber=telephoneNumber.replaceAll("(\\d)"+NUM_REGEX
                            ,NUM_FORMAT);
                    add(telephoneNumber);
                }else if (telephoneNumber.length() == 10){
                    telephoneNumber = telephoneNumber.replaceAll(NUM_REGEX,NUM_FORMAT2);
                    add(telephoneNumber);
                }else{
                    System.out.println("Неверный ввод номера");

                }

            }
        }

    public static void add(String telephoneNumber){
        if(phoneBook.contains(telephoneNumber)){
            System.out.println("Такой номер уже записан в телефонной книге");
            return;
        }
        phoneBook.add(telephoneNumber);
        System.out.println("Номер " + telephoneNumber + " успешно добавлен");
    }
    public static void print(){
        if(phoneBook.isEmpty()){
            System.out.println("Телефонная книга пуста");
            return;
        }
        for(String print: phoneBook){
            System.out.println(print);
        }
    }

}