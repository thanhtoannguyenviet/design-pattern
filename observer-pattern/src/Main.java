public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.setNotifyInformation("Welcome to observer-pattern");
        subject.attach(new Logger());
        subject.attach(new Mailer());
        subject.notifyChange();
        subject.setNotifyInformation("Goodbye observer-pattern");
        subject.notifyChange();
    }
}
