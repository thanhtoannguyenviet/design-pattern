import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TaskService taskService = new TaskService();
        taskService.setState(new NewState());
        taskService.handleRequest();
        taskService.setState(new InProcessState());
        taskService.handleRequest();
    }
}
