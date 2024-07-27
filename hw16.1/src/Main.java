import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final String TODO_FOR_INDEX ="(\\d+)(\\s+)(.+)";
    private static final String INDEX_REGEX = "^\\d+";

    private static List<String> todos = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println("\t\tДобро пожаловать в программу для хранения списка дел");
        String info = "Список доступных команд:" +
                        "\nДобавить {дело}" +
                        "\nДобавить {номер} {дело}" +
                        "\nУдалить  {номер}" +
                        "\nИзменить {номер} {новое дело}" +
                        "\nПечать" +
                        "\nИнфо" +
                        "\nВыход\n";
        System.out.println(info);
    while(true) {
    System.out.println("Введите команду: ");
    String input = new Scanner(System.in).nextLine();
    String command = input;
    String payLoad = "";
    if(input.contains(" ")) {
        String[] lexemes = input.split("\\s+", 2);
        command = lexemes[0];
        payLoad = lexemes[1].trim();
    }

        if(command.toLowerCase().equals("добавить")){
            if(payLoad.matches(TODO_FOR_INDEX)){
           Integer index = Integer.parseInt(payLoad.replaceAll(TODO_FOR_INDEX,"$1"));
           String todo = payLoad.replaceAll("^\\d+","").trim();
           add(todo, index);
            }else{
           add(payLoad);
            }

        }else if(command.toLowerCase().equals("удалить")){
                Integer index = Integer.parseInt(payLoad);
                delete(index);

        }else if(command.toLowerCase().equals("изменить")){
            Integer index = Integer.parseInt(payLoad.replaceAll(TODO_FOR_INDEX,"$1"));
            String newTodo = payLoad.replaceAll(INDEX_REGEX,"").trim();
            change(newTodo, index);

        }else if(command.toLowerCase().equals("выход")){
            System.out.println("До свидания!");
            return;
        }else if (command.toLowerCase().equals("печать")){
            printAll();
        }else{
            System.out.println(info);
        }
    }
    }
    public static void add(String todo){
        todos.add(todo);
        System.out.println("Добавлено дело: \"" + todo + " \"");

    }
    public static void add(String todo,Integer index){
        if(todos.size()<=index){
            todos.add(todo);
            System.out.println("Нет места под номером " + index + ". Дело \"" + todo + "\" добавлено в конец списка.");
            return;
        }
            todos.add(index,todo);
            System.out.println("На " + index + " место добавлено дело: " + todo);
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


