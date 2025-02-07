import java.time.LocalDate;
import java.time.Month;

public class Homework {
    private String theme;
    private String date;
//    private final int day;
//    private final Month month;
//    private final int year;

    public Homework() {
//        this.day = LocalDate.now().getDayOfMonth();
//        this.month = LocalDate.now().getMonth();
//        this.year = LocalDate.now().getYear();
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setDate(String date) {
     this.date = date;
    }

    public String getTheme() {
        return this.theme;
    }

    public String getDate() {
        return this.date;
    }

//    public int getDay() {
//        return day;
//    }
//
//    public Month getMonth() {
//        return month;
//    }
//
//    public int getYear() {
//        return year;
//    }
}
