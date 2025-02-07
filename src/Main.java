import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void printThemeAndDate(String theme, String date) {
        System.out.println("------------------------------------");
        System.out.println("Тема: " + theme);
        System.out.println("Дата: " + date);
        System.out.println("------------------------------------");
    }

    public static String setNow() {
        int day = LocalDate.now().getDayOfMonth();
        Month month = LocalDate.now().getMonth();
        int year = LocalDate.now().getYear();
        return day + " " + month + " " + year;
    }

    public static void printTask(int n) {
        if (n != 1) {
            System.out.println("-------------------------------------------------------------------");
        }
        System.out.println("Task " + n);
    }

    public static void main(String[] args) {
        Homework homework12 = new Homework();
        homework12.setTheme("Объекты и классы 2");
        homework12.setDate(setNow());
        printThemeAndDate(homework12.getTheme(), homework12.getDate());
        printTask(1);
        Author jones = new Author("Kate", "Jones");
        Book butterfly = new Book("Butterfly", jones, 2024);
//        System.out.println("butterfly.getTitle() = " + butterfly.getTitle());
//        System.out.println("butterfly.getPublicationYear() = " + butterfly.getPublicationYear());
//        System.out.println("jones.getName() = " + jones.getName());
//        System.out.println("jones.getSurname() = " + jones.getSurname());
        Author macmail = new Author("John", "MacMail");
        Book prettyGirl = new Book("Pretty Girl", macmail, 1967);
//        System.out.println("prettyGirl.getTitle() = " + prettyGirl.getTitle());
//        System.out.println("prettyGirl.getPublicationYear() = " + prettyGirl.getPublicationYear());
//        System.out.println("macmail.getName() = " + macmail.getName());
//        System.out.println("macmail.getSurname() = " + macmail.getSurname());
        System.out.println(prettyGirl);
        System.out.println(butterfly);
    }
}