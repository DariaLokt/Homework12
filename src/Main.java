import java.time.Month;

public class Main {

    public static void printThemeAndDate(String theme, int day, Month month, int year) {
        System.out.println("------------------------------------");
        System.out.println("Тема: " + theme);
        System.out.println("Дата: " + day + " " + month + " " + year);
        System.out.println("------------------------------------");
    }

    public static void printTask(int n) {
        if (n != 1) {
            System.out.println("-------------------------------------------------------------------");
        }
        System.out.println("Task " + n);
    }

    public static void main(String[] args) {
        Homework homework12 = new Homework();
        homework12.setTheme("Объекты и классы");
        printThemeAndDate(homework12.getTheme(), homework12.getDay(), homework12.getMonth(), homework12.getYear());
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
    }
}