public class InProcessState implements State{
    @Override
    public void handleRequest() {
        System.out.println("Task is in process");
    }
}
