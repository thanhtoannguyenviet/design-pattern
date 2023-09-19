public class NewState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Task is created");
    }
}
