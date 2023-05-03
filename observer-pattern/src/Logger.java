public class Logger implements Observer{
    @Override
    public void update(String mess) {
        System.out.println("LOGGER:"+mess);
    }
}
