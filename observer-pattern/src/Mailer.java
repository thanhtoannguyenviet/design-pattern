public class Mailer implements Observer {
    @Override
    public void update(String mess) {
        System.out.println("MAILER:"+mess);
    }
}
