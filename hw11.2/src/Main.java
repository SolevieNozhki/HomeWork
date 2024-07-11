import java.util.Scanner;
public class Main {
    private static final String NUM_REGEX = "(\\d{3})(\\d{3})(\\d{2})(\\d{2})";
    private static final String NUM_FORMAT = "+7 ($2) $3 $4-$5";
    private static final String NUM_FORMAT2 = "+7 ($1) $2 $3-$4";
    public static void main(String[] args) {
        while(true) {
            System.out.println("Введите номер телефона");
            String telephoneNumber = new Scanner(System.in).nextLine();
            telephoneNumber = telephoneNumber.replaceAll("\\D+","");
            if(telephoneNumber.length() == 11){
                telephoneNumber=telephoneNumber.replaceAll("(\\d)"+NUM_REGEX
                        ,NUM_FORMAT);

            }else if (telephoneNumber.length() == 10){
                telephoneNumber = telephoneNumber.replaceAll(NUM_REGEX,NUM_FORMAT2);
            }else{
                System.out.println("Неверный ввод номера");
            }
            System.out.println(telephoneNumber);
        }

    }
}