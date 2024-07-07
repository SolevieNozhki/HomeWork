//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       String a = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФЪЦЧШЩЪЪЫЬЭЮЯ";
        for (int i = 0; i <a.length(); i++) {
            System.out.println(a.charAt(i) + " - " + (int) a.charAt(i));
        }



    }
}