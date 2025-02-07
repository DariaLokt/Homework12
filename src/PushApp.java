public class PushApp {
    public static void main(String[] args) {
        Author macmail = new Author("John", "MacMail");
        Book prettyGirl = new Book("Pretty Girl", macmail, 1967);
        prettyGirl.setPublicationYear(1977);
        System.out.println(prettyGirl);
    }
}