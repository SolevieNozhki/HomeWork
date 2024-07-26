import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static List<String> todos = new ArrayList<String>();
    private static final String ADD_VALID = "([Добавить]+\\s[А-я]+\\s[А-я]+)";
    private static final String ADD_INDEX_VALID = "([Добавить]+\\s\\d+\\s[А-я]+\\s[А-я]+)";
    private static final String DELETE_VALID = "([Удалить]+\\s\\d+)";
    private static final String CHANGE_VALID = "([Изменить]+\\s\\d+\\s[А-я]+\\s[А-я]+)";
    private static final String PRINT_VALID = "([Печать]+)";


    public static void main(String[] args) {
        System.out.println("\t\tДобро пожаловать в программу для хранения списка дел");
        String info = "Список доступных команд:" +
                        "\nДобавить {дело}" +
                        "\nДобавить {номер} {дело}" +
                        "\nУдалить  {номер}" +
                        "\nИзменить {номер} {новое дело}" +
                        "\nПечать\n";
        System.out.println(info);
    while(true) {
    System.out.println("Введите команду: ");
    String input = new Scanner(System.in).nextLine();

    if (input.matches(ADD_VALID)) {
        add(input);
    } else if (input.matches(ADD_INDEX_VALID)) {
        String[] split = input.split("\\s+");
        int index = Integer.parseInt(split[1]);
        add(input, index);
    } else if (input.matches(DELETE_VALID)) {
        String[] split = input.split("\\s+");
        int index = Integer.parseInt(split[1]);
        delete(index);
    }else if(input.matches(CHANGE_VALID)) {
        String[] split = input.split("\\s+");
        int index = Integer.parseInt(split[1]);
        change(input,index);
    }else if (input.matches(PRINT_VALID)) {
        printAll();
    }
}

    }
    public static void add(String todo){
        todos.add(todo.substring(todo.indexOf(' ')).trim());
        System.out.println("Добавлено дело: " + todo.substring(todo.indexOf(' ')));

    }
    public static void add(String todo,Integer index){
        if(todos.size()<=index){
            todos.add(todo);
            System.out.println("Нет места под номером " + index + ". Дело \"" + todo + "\" добавлено в конец списка.");
            return;
        }
            todos.add(index, todo.substring(todo.indexOf(' ')));
            System.out.println("На " + index + " место добавлено дело: " + todo.substring(todo.indexOf(' ')));
    }

    public static void delete(Integer index) {
        if (todos.size()<=index) {
            System.out.println("Дела под номером " + index + " нет в списке.");
            return;
        }
        String todo = todos.get(index);
        todos.remove(todo);
        System.out.println("Дело " + todo + " под номером " + index + " успешно удалено.");

    }
    public static void change(String newTodo, Integer index){
        if(todos.size()<=index){
            System.out.println("Дела под номером " + index + " нет в списке.");
            return;
        }
        System.out.println("Дело " + todos.get(index) + " изменено на " + newTodo);
        todos.set(index, newTodo);


    }
    public static void printAll() {
        if(todos.isEmpty()){
            System.out.println("Список дел пуст");
            return;
        }
        for(String todo : todos){
            System.out.println(todo);
        }

        }
    }


