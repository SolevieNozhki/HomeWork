import java.sql.SQLOutput;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static Map<String, Set<String>> phoneBook = new TreeMap<>();
    private static final String NAME_VALID = "([А-я]+)";
    private static final String NUM_VALID = "(\\d{11}|\\d{10})";

    public static void main(String[] args) {
        System.out.println("\t\tДобро пожаловать в телефонную книгу\n\n");
        while (true) {
            System.out.println("Введите номер, имя или команду:");
            String input = new Scanner(System.in).nextLine().trim();
            if (input.matches(NAME_VALID)) {
                addByName(input);
            } else if (input.matches(NUM_VALID)) {
                addByNum(input);
            } else if (input.equalsIgnoreCase("list")) {
                print();
            } else if(input.equalsIgnoreCase("exit")){
                break;
            }
            else {
                System.out.println("Неверный формат ввода");
            }

        }
    }
         private static void addByName(String name) {
            if (phoneBook.containsKey(name)) {
                System.out.println("Контакт \"" + name + "\" уже существует");
            }
            System.out.println("Введите номер для контакта \"" + name + "\"");
            String num = new Scanner(System.in).nextLine();
            num = num.replaceAll("\\D+", "");
            if (!num.matches("\\d+")) {
                System.out.println("Это не номер!");
                return;
            }
            for(Map.Entry<String,Set<String>> contact : phoneBook.entrySet()){
                if(contact.getValue().contains(num)){
                    System.out.println("Номер " + num + " принадлежит другому контакту");
                    return;
                }
            }
            addToBook(name,num);
            }

        public static void addByNum (String num) {
            for (Map.Entry<String, Set<String>> contact : phoneBook.entrySet()) {
                if (contact.getValue().contains(num)) {
                    System.out.println("Абонент с номером " + num + " уже существует");
                }
            }
            System.out.println("Введите имя абонента для номера \"" + num + "\"");
            String name = new Scanner(System.in).nextLine().trim();
            if (!name.matches(NAME_VALID)) {
                System.out.println("Это не имя!");
                return;
            }
            for (Map.Entry<String, Set<String>> contact : phoneBook.entrySet()) {
                if (contact.getKey().contains(num)) {
                    System.out.println("Имя " + name + " принадлежит другому контакту");
                    return;
                }
                addToBook(name, num);
            }
        }

        public static void addToBook(String name, String num){
            if(phoneBook.containsKey(name)){
            phoneBook.get(name).add(num);
            System.out.println("Абоненту \"" + name + "\" добавлен номер " + num);

            }else {
            Set<String> nums = new TreeSet<>();
            nums.add(num);
            phoneBook.put(name, nums);
            System.out.println("Контакт сохранен!");
            }
        }

        public static void print () {
            if (phoneBook.isEmpty()) {
                System.out.println("Телефонная книга пуста");
                return;
            }
            for (Map.Entry<String, Set<String>> entry : phoneBook.entrySet()) {
                System.out.println("Контакт: " + entry.getKey() + "\nНомера: ");
                for(String abonent: entry.getValue()){
                    System.out.println(abonent);
                }

            }
        }
    }
