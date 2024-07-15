import java.time.LocalDate;
import java.time.Period;

public class Wine {
   private String name;
   private String marka;
   private String counrty;
   private LocalDate date;
   private String description;

    public Wine() {
    }

    public Wine(String name, String marka, String counrty, LocalDate date, String description) {
        this.name = name;
        this.marka = marka;
        this.counrty = counrty;
        this.date = date;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getCounrty() {
        return counrty;
    }

    public void setCounrty(String counrty) {
        this.counrty = counrty;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void winePeriod(LocalDate now){
        System.out.println("Выдержка вина составляет: "+ Period.between(date,now).getYears() + " лет");
    }
}
