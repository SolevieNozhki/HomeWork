import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Wine wine1 = new Wine("Цица","Вина кубани","Россия", LocalDate.of(2001,01,01),"приятный бархатистый аромат");
        Wine wine2 = new Wine("Киндзмараули","Фанагория","Италия",LocalDate.of(1995,10,05) ,"яркий красный оттенок");
        wine1.winePeriod(LocalDate.of(2005,10,10));
        wine2.winePeriod(LocalDate.now());

    }
}